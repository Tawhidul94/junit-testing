package com.tawhid.testRepo;

import com.tawhid.entity.Person;
import com.tawhid.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;


    @Test
    void existsByPersonId() {
       //data save
        Person person = new Person();
        person.setPersonId(1);
        person.setPersonName("Tawhid");
        person.setPersonCity("Dhaka");
        personRepository.save(person);
       Person actual = this.personRepository.findByPersonId(1);
        assertThat(actual).isEqualTo(person);
    }
}