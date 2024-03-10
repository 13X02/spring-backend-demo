package com.example.crudmongodemo.controller;


import com.example.crudmongodemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.crudmongodemo.collection.Person;

import java.util.List;


@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public String save(@RequestBody Person person){
        return personService.save(person);
    }

    @GetMapping
    public List<Person> getPersonStartsWith(@RequestParam("name") String name){
        return personService.getPersonStartsWith(name);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return personService.delete(id);
    }


    @GetMapping("/age")
    public List<Person> getByPersonAge(@RequestParam Integer minAge , @RequestParam Integer maxAge){
        return personService.getByPersonAge(minAge,maxAge);
    }
}
