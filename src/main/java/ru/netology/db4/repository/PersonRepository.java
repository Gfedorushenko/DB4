package ru.netology.db4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.netology.db4.person.Person;

import java.util.List;
import java.util.Optional;


public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query(value = "select * from ddl.person p where city=?1",nativeQuery = true)
    List<Person> findAllByCity(String cityName);

    @Query(value = "select p from Person p where p.age<:age ORDER BY p.age")
    List<Person> findAllByAgeLessThanOrderByAgeJPQL(@Param("age") int age);

    @Query(value = "select * from ddl.person p where name=?1 and surname=?2",nativeQuery = true)
    Optional<Person> findAllByNameAndSurname(String name, String surname);
}
