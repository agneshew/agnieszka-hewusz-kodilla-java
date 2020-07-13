package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class CollectionTestSuite {
        @Before
        public void before(){
            System.out.println("Test Case: begin");
        }
        @After
        public void after(){
            System.out.println("Test Case: end");
        }
        @Test
    public void testOddNumbersExterminatorEmptyList (){
        //Given
            ArrayList <Integer> numbers = new ArrayList<>();
            ArrayList <Integer> numbersExOdd;
            //When
            numbersExOdd = OddNumbersExterminator.exterminate(numbers);
            //Then
            Assert.assertEquals(numbersExOdd.size(), 0);
        }
    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given
        ArrayList <Integer> numbers = new ArrayList<>();
        ArrayList <Integer> numbersExOdd;

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        //When
        numbersExOdd = OddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(numbersExOdd.size(), 3);
    }
}

