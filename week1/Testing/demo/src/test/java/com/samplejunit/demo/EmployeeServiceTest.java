package com.samplejunit.demo;

import com.samplejunit.demo.model.Employee;
import com.samplejunit.demo.repository.EmployeeRepository;
import com.samplejunit.demo.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
    //Mocking
    @Mock
    private EmployeeRepository employeeRepository;

    //Injecting
    @InjectMocks
    private EmployeeService employeeService;

    @Test
    void testGetEmployeeById() {
        //Arrange
        Employee employee = new Employee(1,"sanjay",15000);
        //Stubbing
        when(employeeRepository.findById(1)).thenReturn(Optional.of(employee));
        //Act
        Employee emp = employeeService.findById(1);
        //Assert
        assertEquals(1,emp.getId());
        assertEquals("sanjay",emp.getName());


    }
}
