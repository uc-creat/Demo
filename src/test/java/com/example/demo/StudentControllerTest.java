package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashSet;

import java.util.Set;

import static java.util.Collections.emptySet;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private StudentService studentService;

    @Test
    void shouldGetAllStudents() throws Exception{

        when(studentService.getStudents()).thenReturn(emptySet());

        mockMvc.perform(get("/"))
                .andExpect(content().string("[]"))
                .andExpect(status().isOk());

        verify(studentService).getStudents();

    }

    @Test
    void shouldCreateAllStudents() throws Exception{

        Student student = new Student("Sethu");

        doNothing().when(studentService).addStudents(student);

        mockMvc.perform(post("/").content(objectMapper.writeValueAsString(student))
                        .header("Content-Type","application/json"))
                .andExpect(status().isCreated());



        verify(studentService).addStudents(student);

    }


}
