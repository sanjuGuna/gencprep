package com.samplejunit.demo;

import com.samplejunit.demo.service.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; //use static imports to improve readability and reduce boilerplate
//without static, we need to use its class name as prefix to use its methods eg. Assertion.assertEquals()

public class CalculatorTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }
    Calculator calculator;
    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
        calculator = new Calculator();
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }
    @Test
    void additionTest(){
//        Calculator calculator = new Calculator();
        int result = calculator.add(1,2);
        //System.out.println(result);
        System.out.println("Addition test");
        assertEquals(3,result);
        assertNotEquals(0,result);
        assertTrue(result > 0);
//        assertFalse(result < 0);
    }
    
    @Test
    void subtractionTest(){
        //Arrange
//        Calculator calculator = new Calculator();

        //Act
        int result = calculator.subtract(2,2);
        //System.out.println(result);
        System.out.println("Subtraction test");
        //Assert
        assertEquals(0,result);
        assertNotEquals(1,result);
        assertTrue(result == 0);
//        assertFalse(result < 0);
    }
    @Test
    void divideTest(){
//        Calculator calculator = new Calculator();
        System.out.println("Divide test");
        assertThrows(ArithmeticException.class,()->{calculator.divide(2,0);});
    }
}
