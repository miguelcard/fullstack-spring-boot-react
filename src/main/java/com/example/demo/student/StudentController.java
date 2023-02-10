package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
                new Student(1L, "Nelson", "nelson.amigos@gmail.com", Gender.MALE),
                new Student(2L, "Miguel", "migueluy@gmail.com", Gender.MALE),
                new Student(3L, "Maria", "maria@gmail.com", Gender.FEMALE)
        );
    }
}
