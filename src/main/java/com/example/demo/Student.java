package com.example.demo;

import java.util.Objects;

public class Student {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    private String name;



    public Student(){

    }
    public Student(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
