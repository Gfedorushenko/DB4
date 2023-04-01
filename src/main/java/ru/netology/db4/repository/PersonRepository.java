package ru.netology.db4.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.db4.person.Person;

import java.util.List;


@Repository
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    public PersonRepository() {
    }

    public List<Person> getPersonsByCity(String city){
        List<Person> persons= entityManager.createQuery("select p from Person p where p.city_of_living = :city", Person.class)
                .setParameter("city",city)
                .getResultList();
        return persons;
    }
}
