package ru.netology.db4.controller;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.db4.person.Person;
import ru.netology.db4.repository.PersonRepository;

import java.util.List;
import java.util.Optional;


@Transactional
@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons/by-city")
    public List<Person> getAuthorities(@RequestParam(name = "city") String city) {
        return personRepository.findAllByCity(city);
    }

    @GetMapping("/persons/age-less")
    public List<Person> getAuthorities(@RequestParam(name = "age") int age) {
        return personRepository.findAllByAgeLessThanOrderByAgeJPQL(age);
    }

    @GetMapping("/persons/{name}+{surname}")
    public Optional<Person> getAuthorities(@PathVariable String name, @PathVariable String surname) {
        return personRepository.findAllByNameAndSurname(name, surname);
    }
}
