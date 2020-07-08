package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator myCalculator = new Calculator();

        int resultAdd = myCalculator.addAToB(10, 5);
        int resultSubtract = myCalculator.subtractAFromB(10, 5);


        if ((resultAdd == (10 + 5)) && (resultSubtract == (10 - 5))){
            System.out.println("test OK");
        }
        else {
            System.out.println("Error!");
        }
    }
}