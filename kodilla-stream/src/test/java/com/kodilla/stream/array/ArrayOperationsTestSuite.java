package com.kodilla.stream.array;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

import static jdk.nashorn.internal.objects.NativeArray.forEach;
import static jdk.nashorn.internal.objects.NativeArray.indexOf;


public class ArrayOperationsTestSuite {
    public ArrayOperations arrayOperations;
    public ArrayOperationsTestSuite(ArrayOperations arrayOperations) {
        this.arrayOperations = arrayOperations;
    }
    @Test
    public void testGetAverage() {
        //Given
        int[] arrayToTest = {2,3,4,5,6,7,8,1,2,3,2,3,4,5,6,7,8,1,2,3};

        //When




        IntStream.range(0, arrayToTest.length)
        .forEach(i -> arrayToTest[i]++);

        IntStream.range(0, arrayToTest.length)
                .forEach(i -> System.out.println(arrayToTest[i]));

    }
}
