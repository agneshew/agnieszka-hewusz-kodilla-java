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
            //When
            OddNumbersExterminator.exterminate(numbers);
            int x = numbers.size();
            //Then
            Assert.assertEquals(numbers.size(), 2);
        }
    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(0,1);
        numbers.add(0,2);
        numbers.add(0,3);
        numbers.add(0,4);
        //When
        OddNumbersExterminator.exterminate(numbers);
        int x = numbers.size();
        //Then
        Assert.assertEquals(numbers.size(), 2);
    }
}

