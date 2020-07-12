package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> numbers;

    public ArrayList<Integer> getNumbers () {
        return numbers;
    }

    public ArrayList<Integer> addToList (Integer number) {
        numbers.add(number);
        return numbers;
    }

    public static ArrayList<Integer> exterminate (ArrayList<Integer> numbers) {
        for (int i = 0; i <numbers.size(); i++) {
            if (i % 2 != 0) {
                numbers.remove(i);
            }
        }
        return numbers;
    }
}
