package com.example.demo;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DummyData implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public DummyData(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
      studentRepository.save(new Student("Mercy", "Karagi"));
      studentRepository.save(new Student("Emma", "Awuor"));
      studentRepository.save(new Student("Celia", "Yano"));
    }
}
