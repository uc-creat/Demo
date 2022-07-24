package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    //private Set<Student> studentName = new HashSet<>();

    @GetMapping("/")
    public Set<Student> getStudent(){
        return studentService.getStudents();
    }

    @PostMapping("/")
    public ResponseEntity createStudent(@RequestBody Student name){
        studentService.addStudents(name);
        return ResponseEntity.status(HttpStatus.CREATED).build();



    }
}
