package com.example.demo.service;

//import com.demo1.domain.Student;

import com.example.demo.domain.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student Student);

    List<Student> findAllStudents();

    Student findById(Long id);

    void deleteStudent(Long id);

    Student updateStudent(Student student);

    List<Student>search(String searchTerm);

}
