package com.example.studentsapi.repositories;

import com.example.studentsapi.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student, Long> {

    // Student findById(long id);

    // List<Student> findByLastName(String lastName);

    // Custom query
    // @Query("SELECT b FROM students b WHERE b.publishDate > :date")
    // List<Student> findByPublishedDateAfter(@Param() am("date") LocalDate date);
}
