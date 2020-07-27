package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream printStream = IntStream.range(0, numbers.length);
        int[] array = printStream.toArray();
        System.out.println(array);

        OptionalDouble average = IntStream.range(0, numbers.length).average();
        return (average.getAsDouble());
    }


}
