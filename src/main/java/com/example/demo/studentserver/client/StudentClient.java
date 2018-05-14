package com.example.demo.studentserver.client;

import com.example.demo.studentserver.domain.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="students",url="10.51.44.121:5000")
public interface StudentClient {
    @RequestMapping(value="/students",method = RequestMethod.GET)
    List<Student> getStudents();

    @RequestMapping(value ="/students", method=RequestMethod.POST)
    Student createStudent(@RequestBody Student student);


}
