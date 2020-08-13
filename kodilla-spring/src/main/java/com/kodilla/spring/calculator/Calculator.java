package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public Double add(double a, double b) {
        display.displayValue(a*b);
        return (a+b);
    }
    public Double sub(double a, double b) {
        display.displayValue(a-b);
        return (a-b);
    }
    public Double mul(double a, double b) {
        display.displayValue(a*b);
        return (a*b);
    }
    public Double div(double a, double b) {
        display.displayValue(a/b);
        return (a/b);
    }


}
