package com.tawhid.service;

import com.tawhid.entity.Person;
import com.tawhid.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

     @Autowired
        private PersonRepository personRepository;

     public List<Person> getPersonList() {
          return this.personRepository.findAll();
     }
}
