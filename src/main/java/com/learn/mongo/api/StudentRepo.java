package com.learn.mongo.api;

import com.learn.mongo.api.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends MongoRepository<Student,String> {
    Optional<Student> findByEmail(String email);
}
