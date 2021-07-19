package com.learn.mongo.api;

import com.learn.mongo.api.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;
    @GetMapping
    public List<Student> allStudents(){
        return studentRepo.findAll();
    }
    @PostMapping
    public String insert(@RequestBody Student student){
        studentRepo.insert(student);
        return "good";
    }
}
