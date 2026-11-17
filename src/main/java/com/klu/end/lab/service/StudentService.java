package com.klu.end.lab.service;

import com.klu.end.lab.entity.Student;
import com.klu.end.lab.repository.StudentRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // Add Student
    public Student addStudent(Student student) {
        return repository.save(student);
    }

    // Get Student by ID
    public Student getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Student not found"));
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}