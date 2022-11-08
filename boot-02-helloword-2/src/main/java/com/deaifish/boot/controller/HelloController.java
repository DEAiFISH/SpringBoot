package com.deaifish.boot.controller;

import com.deaifish.boot.bean.Person;
import com.deaifish.boot.bean.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Person person;

    @Autowired
    Pet pet;


    @RequestMapping("/pet")
    public Pet pet() {
        return pet;
    }

    @RequestMapping("/person")
    public Person person() {
        return person;
    }
}
