package com.samplejunit.demo;

import com.samplejunit.demo.service.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void additionTest(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2);
        System.out.println(result);
    }
}
