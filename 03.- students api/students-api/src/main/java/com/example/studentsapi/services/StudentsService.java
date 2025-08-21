package com.example.studentsapi.services;

import com.example.studentsapi.domain.Student;
import com.example.studentsapi.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;

    public List<Student> findAll() {
        return studentsRepository.findAll();
    }

    public void save(Student student) {
        studentsRepository.save(student);
    }

}
