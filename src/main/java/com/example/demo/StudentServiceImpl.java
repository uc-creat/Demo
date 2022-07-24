package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Set<Student> getStudents() {
        return studentRepository.getStudent();
    }

    @Override
    public void addStudents(Student student) {

        studentRepository.addStudent(student);
    }
}
