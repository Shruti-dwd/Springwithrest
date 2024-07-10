package com.example.EcommerceApi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Employee {
    @Id
    private String id;
    private String name;
    private int age;
    private String department;
    private String position;
    private LocalDate hireDate;

    // Getters and setters
}
