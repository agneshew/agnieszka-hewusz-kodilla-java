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
        int[] numbers = new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        //When
        double realAverage = ArrayOperations.getAverage(numbers);
        //Then
        double expectedAverage = 1;
        Assert.assertEquals(expectedAverage, realAverage, 0);

    }
}
