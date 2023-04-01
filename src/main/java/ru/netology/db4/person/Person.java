package ru.netology.db4.person;

import jakarta.persistence.*;

import java.io.Serializable;


@Table(schema = "ddl", name = "person")
@Entity

public class Person implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, length = 200)
    private String name;
    private String surname;
    private int age;
    private String phone_number;
    private String city_of_living;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getCity_of_living() {
        return city_of_living;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phone_number='" + phone_number + '\'' +
                ", city_of_living='" + city_of_living + '\'' +
                '}';
    }
}
