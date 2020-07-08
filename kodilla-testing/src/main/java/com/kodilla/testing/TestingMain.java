package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator myCalculator = new Calculator (5,10);

        int resultAdd = myCalculator.addAToB();

        if (resultAdd == (5+10)){
            System.out.println("Add - test OK");
        } else {
            System.out.println("Add - Error!");
        }
        int resultSubtract = myCalculator.subtractAFromB();

        if (resultSubtract == (5-10)){
            System.out.println("Subtract - test OK");
        } else {
            System.out.println("Subtract - Error!");
        }
    }
}