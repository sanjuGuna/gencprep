package com.samplejunit.demo.repository;

import com.samplejunit.demo.model.Employee;

import java.util.Optional;

public interface EmployeeRepository {
    Optional<Employee> findById(int id);
}
