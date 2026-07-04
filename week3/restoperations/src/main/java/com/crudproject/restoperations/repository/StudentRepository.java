package com.crudproject.restoperations.repository;

import com.crudproject.restoperations.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
