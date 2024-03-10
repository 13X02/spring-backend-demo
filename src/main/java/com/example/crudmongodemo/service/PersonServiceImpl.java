package com.example.crudmongodemo.service;

import com.example.crudmongodemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crudmongodemo.collection.Person;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }

    @Override
    public List<Person> getPersonStartsWith(String name) {
        return personRepository.findByFirstNameStartsWith(name);
    }

    @Override
    public String delete(String id) {
        personRepository.deleteById(id);
        return "Success";
    }

    @Override
    public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
        return personRepository.findPersonByAgeBetween(minAge, maxAge);
    }
}
