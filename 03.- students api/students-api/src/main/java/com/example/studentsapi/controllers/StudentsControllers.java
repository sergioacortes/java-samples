package com.example.studentsapi.controllers;

import com.example.studentsapi.commands.CreateStudentRequest;
import com.example.studentsapi.domain.Student;
import com.example.studentsapi.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsControllers {

    @Autowired
    private StudentsService studentsService;

    @GetMapping("api/v1/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getStudents() {
        List<Student> students = studentsService.findAll();
        return students;
    }

    @PostMapping("api/v1/students")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody CreateStudentRequest request) {
        Student student = new Student(0L, request.firstName(), request.lastName());
        studentsService.save(student);
    }

}
