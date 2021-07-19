package com.learn.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private Gender gender;
    private Address address;
    private List<String> subjects;
    private BigDecimal totalSpentInBooks;
    private LocalDateTime created;

    public Student(String firstname,
                   String lastname,
                   String email,
                   Gender gender,
                   Address address,
                   List<String> subjects,
                   BigDecimal totalSpentInBooks,
                   LocalDateTime created) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.subjects = subjects;
        this.totalSpentInBooks = totalSpentInBooks;
        this.created = created;
    }
}
