package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersExterminator {
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> numbersExOdd;

    public ArrayList<Integer> getNumbers () {
        return numbers;
    }
    public ArrayList<Integer> getNumbersExOdd () {
        return numbersExOdd;
    }


//    public ArrayList<Integer> addToList (Integer number) {
//        numbersExOdd.add(number);
//        return numbersExOdd;
//    }

    public static ArrayList<Integer> exterminate (ArrayList<Integer> numbers, ArrayList<Integer> numbersExOdd) {
        Iterator<Integer> i = numbers.iterator();
        while (i.hasNext()){
            Integer n = i.next();
            if (n % 2 != 0) {
                numbersExOdd.add(n);
                numbers.remove(n);
            }
        }
        return numbers;
    }
}
