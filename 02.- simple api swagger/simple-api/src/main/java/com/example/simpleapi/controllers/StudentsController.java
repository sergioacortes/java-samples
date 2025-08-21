package com.example.simpleapi.controllers;

import com.example.simpleapi.resources.StudentResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentsController {

    @GetMapping("api/v1/students")
    public List<StudentResource> getStudents() {
        List<StudentResource> students = new ArrayList<>();
        students.add(new StudentResource("John", "Smith"));
        students.add(new StudentResource("John", "Smith"));
        students.add(new StudentResource("John", "Smith"));
        students.add(new StudentResource("John", "Smith"));
        students.add(new StudentResource("John", "Smith"));
        return students;
    }

}
