package ru.netology.db4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.netology.db4.person.Person;

import java.util.List;
import java.util.Optional;


public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findAllByCity(String cityName);

    List<Person> findAllByAgeLessThanOrderByAge(int age);

    Optional<Person> findAllByNameAndSurname(String name, String surname);
}
