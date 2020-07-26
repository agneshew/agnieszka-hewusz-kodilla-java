package com.kodilla.stream.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
//    public ArrayOperations arrayOperations;
//    public ArrayOperationsTestSuite(ArrayOperations arrayOperations) {
//        this.arrayOperations = arrayOperations;
//    }
    @Test
    public void testGetAverage() {
        //Given
        int[] arrayToTest = {2,3,4,5,6,7,8,1,2,3,2,3,4,5,6,7,8,1,2,3};
        //When
        IntStream printStream = IntStream.range(0, arrayToTest.length);
        int[] arr = printStream.toArray();
        System.out.println(Arrays.toString(arr));
        //Then
        //arrayToTest = ArrayOperations.getAverage(arrayToTest[]);

    }
}
