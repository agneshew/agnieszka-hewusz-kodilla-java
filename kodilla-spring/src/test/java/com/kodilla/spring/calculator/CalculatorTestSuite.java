package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double add = calculator.add(2.5, 3.5);
        Double sub = calculator.sub(4.5, 3.5);
        Double mul = calculator.mul(5.5, 2);
        Double div = calculator.div(20, 2.5);

        //Then
        Assert.assertEquals(6, add, 0);
        Assert.assertEquals(1, sub, 0);
        Assert.assertEquals(11, mul, 0);
        Assert.assertEquals(8, div, 0);


    }

}
