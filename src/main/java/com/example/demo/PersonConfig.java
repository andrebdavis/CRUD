package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
@Configuration
public class PersonConfig {
    @Autowired
    private PersonRepository repository;

    @PostConstruct
    public void setup() {
        Person person1 = new Person();
        person1.setFirstName("Andre");
        person1.setLastName("Davis");

        Person person2 = new Person();
        person2.setFirstName("Dean");
        person2.setLastName("Walls");

        repository.saveAll(Arrays.asList(
                person1,
                person2
        ));
    }
}
