package com.example.demo.entities;


import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;  
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;


@Getter
@Setter
@Entity
public class Employee{

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    String name;
    String email;
    String phone;
    private String designation;
    private String department;
    private Long salaryStructureId;

}