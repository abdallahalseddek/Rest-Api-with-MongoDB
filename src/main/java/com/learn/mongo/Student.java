package com.learn.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
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
    private ZonedDateTime created;

}
