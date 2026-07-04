package com.crudproject.restoperations.controller;

import com.crudproject.restoperations.entity.Student;
import com.crudproject.restoperations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentservice;
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students=studentservice.findAll();
        return students;
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return studentservice.findById(id);
    }

    @PostMapping("/students/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student){
        studentservice.save(student);
    }

    @PutMapping("students/update/{id}")
    @ResponseStatus(code= HttpStatus.OK)
    public Student updateStudent(@PathVariable int id){
        Optional<Student> find=studentservice.findById(id);
        if(find.isPresent()){
            Student student=find.get();
            student.setName("siva saravana kumar");
            return studentservice.save(student);
        }
        return null;
    }

    @DeleteMapping("students/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        if(studentservice.findById(id).isPresent()){
            studentservice.delete(id);
        }else{
            System.out.println("Student id not found");
        }
    }
}
