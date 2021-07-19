package com.learn.mongo;

import com.learn.mongo.api.entity.Address;
import com.learn.mongo.api.entity.Gender;
import com.learn.mongo.api.entity.Student;
import com.learn.mongo.api.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class MongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoApplication.class, args);
    }
   /* @Bean
    CommandLineRunner runner(StudentRepo repo){
        return args -> {
            Address address = new Address(
                    "Egypt",
                    "meet salsil",
                    "525622"
            );
          Student student = new Student(
                  "abdallah",
                  "ahmed",
                  "abdallahAhmed.com",
                  Gender.MALE,
                  address,
                  List.of("Engineering", "Math"),
                  BigDecimal.TEN,
                  LocalDateTime.now()

          );
            repo.findByEmail(student.getEmail()).ifPresentOrElse(s-> {
                System.out.println("already exists!");
            }, ()->{
                System.out.println("Inserting student");
                repo.insert(student);
            });



        };
    }*/

}
