package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;
@Repository
public class StudentRepository {

    private Set<Student> studentName = new HashSet<>();
    public Set<Student> getStudent() {
        return studentName;
    }


    public void addStudent(Student student) {
        studentName.add(student);

    }

}
