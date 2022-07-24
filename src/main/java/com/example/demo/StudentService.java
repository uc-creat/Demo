package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Set;


public interface StudentService {
    Set<Student> getStudents();

    void addStudents(Student student);

}


