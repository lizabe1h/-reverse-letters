package com.example.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    @Test
    public void testAdd() {
        //Arrange(подготовка)
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;

        //Act(действие)
        int result = calculator.add(a, b);

        //Assert(проверка)
        //   assertEquals(5, result, "2+3=5");
        Assertions.assertEquals(5, result);
    }
}
