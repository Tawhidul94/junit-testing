package com.tawhid.entity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "person_id")
    private Integer personId;

    @Column(name = "person_name")
    private String personName;

    @Column(name = "person_city")
    private String personCity;
}
