package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
//    public ArrayOperations arrayOperations;
//    public ArrayOperationsTestSuite(ArrayOperations arrayOperations) {
//        this.arrayOperations = arrayOperations;
//    }
    @Test
    public void testGetAverage() {
        //Given
        //int[] numbers = {2,3,4,5,6,7,8,1,2,3,2,3,4,5,6,7,8,1,2,3};
        int[] numbers = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        //When
        double realAverage = ArrayOperations.getAverage(numbers);
        //Then
        double expectedAverage = 1;
        Assert.assertEquals(expectedAverage, realAverage, 0);

    }
}
