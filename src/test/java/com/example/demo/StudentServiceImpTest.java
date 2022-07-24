package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static java.util.Collections.emptySet;
import static org.mockito.Mockito.doNothing;


@ExtendWith(MockitoExtension.class)
public class StudentServiceImpTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentServiceImpl studentService;

    @Test
    void getStudent(){

        Mockito.when(studentRepository.getStudent()).thenReturn(emptySet());

        Set<Student> result = studentService.getStudents();

        Assertions.assertEquals(emptySet(), result);
        Mockito.verify(studentRepository).getStudent();


    }

    @Test
    void addStudent(){

        Student student = new Student();
        Set<Student> newStudent = new HashSet<>();
        newStudent.add(student);

        doNothing().when(studentRepository).addStudent(student);




    }


}
