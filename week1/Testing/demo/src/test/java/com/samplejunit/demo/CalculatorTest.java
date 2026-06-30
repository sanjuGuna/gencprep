package com.samplejunit.demo;

import com.samplejunit.demo.service.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; //use static imports to improve readability and reduce boilerplate
//without static, we need to use its class name as prefix to use its methods eg. Assertion.assertEquals()

public class CalculatorTest {
    @Test
    void additionTest(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2);
        //System.out.println(result);
        assertEquals(3,result);
        assertNotEquals(0,result);
        assertTrue(result > 0);
//        assertFalse(result < 0);
    }
    
    @Test
    void subtractionTest(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(2,2);
        //System.out.println(result);
        assertEquals(0,result);
        assertNotEquals(1,result);
        assertTrue(result == 0);
//        assertFalse(result < 0);
    }
}
