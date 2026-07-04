package com.crudproject.restoperations.service;

import com.crudproject.restoperations.entity.Student;
import com.crudproject.restoperations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentrepo;
    public List<Student> findAll(){
        List<Student> students=studentrepo.findAll();
        return students;
    }

    public Optional<Student> findById(int id){
        return studentrepo.findById(id);
    }

    public Student save(Student student){
        return studentrepo.save(student);
    }

    public void delete(int id){
        studentrepo.deleteById(id);
    }
}
