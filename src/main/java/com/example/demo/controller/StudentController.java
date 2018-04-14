package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//tells that this is a controller class and blah blah
@RequestMapping(value = "students")
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
//
    @GetMapping
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    //
    @GetMapping(value="{id}")
    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }


}