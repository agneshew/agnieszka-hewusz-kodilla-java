package com.kodilla.good.patterns.flights;

import java.util.Arrays;
import java.util.List;

public class ArrivesKRK {

    private List<String> arrivesKRK = Arrays.asList("GDN", "WAW", "WRO", "LUZ");

    public List<String> getArrivesKRK() {
        return arrivesKRK;
    }

    @Override
    public String toString() {
        return "ArrivesKRK{" +
                "arrivesKRK=" + arrivesKRK +
                '}';
    }
}
