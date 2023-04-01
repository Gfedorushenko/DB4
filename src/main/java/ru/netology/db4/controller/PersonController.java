package ru.netology.db4.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.db4.person.Person;
import ru.netology.db4.repository.PersonRepository;

import java.util.List;

@RestController
public class PersonController {
    private PersonRepository personRepository;
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    @GetMapping("/persons/by-city")
    public List<Person> getAuthorities(@RequestParam(name = "city") String city) {
        return personRepository.getPersonsByCity(city);
    }
}
