package com.example.crudmongodemo.service;

import com.example.crudmongodemo.collection.Person;
import java.util.List;
public interface PersonService {
    String save(Person person);

    List<Person> getPersonStartsWith(String name);

    String delete(String id);

    List<Person> getByPersonAge(Integer minAge, Integer maxAge);
}
