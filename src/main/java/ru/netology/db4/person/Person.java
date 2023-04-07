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
    private String city;

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

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phone_number='" + phone_number + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
