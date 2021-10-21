package com.example.service;

import com.example.mapper.PersonMapper;
import com.example.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;


    public Person getPersonById(Integer pid) {
        return personMapper.getPersonById(pid);

    }

    public List<Person> getAllPerson() {
        return personMapper.getAllPerson();
    }
}
