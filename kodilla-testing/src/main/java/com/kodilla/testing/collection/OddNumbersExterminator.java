package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate (ArrayList<Integer> numbers) {
        ArrayList<Integer> numbersExOdd = new ArrayList<>();
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            int x = it.next();
            if (x % 2 != 0) {
                numbersExOdd.add(x);
            }
        }
        return numbersExOdd;
    }
}
