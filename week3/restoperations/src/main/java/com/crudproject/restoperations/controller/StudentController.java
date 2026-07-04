package com.crudproject.restoperations.controller;

import com.crudproject.restoperations.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class StudentController {
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return null;
    }
}
