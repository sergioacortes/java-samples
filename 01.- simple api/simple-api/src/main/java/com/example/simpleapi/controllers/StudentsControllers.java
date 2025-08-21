package com.example.simpleapi.controllers;

import com.example.simpleapi.resources.StudentResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentsControllers {

    @GetMapping("api/students")
    public List<StudentResource> getStudents() {
        List<StudentResource> students = new ArrayList<>();
        students.add(new StudentResource("John", "Doe"));
        students.add(new StudentResource("Jane", "Doe"));
        return students;
    }

}
