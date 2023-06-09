package com.tawhid.repository;

import com.tawhid.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person findByPersonId(Integer personId);


}
