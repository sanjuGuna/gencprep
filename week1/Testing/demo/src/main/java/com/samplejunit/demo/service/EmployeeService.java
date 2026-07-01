package com.samplejunit.demo.service;

import com.samplejunit.demo.model.Employee;
import com.samplejunit.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public Employee findById(int id){
        Optional<Employee> emp=employeeRepository.findById(id);
        return emp.orElse(null);
    }
}
