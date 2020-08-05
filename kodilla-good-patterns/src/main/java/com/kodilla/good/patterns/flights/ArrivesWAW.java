package com.kodilla.good.patterns.flights;

import java.util.Arrays;
import java.util.List;

public class ArrivesWAW {

    private List<String> arrivesWAW = Arrays.asList("KRK", "WRO", "LUZ");

    public List<String> getArrivesWAW() {
        return arrivesWAW;
    }

    @Override
    public String toString() {
        return "ArrivesWAW{" +
                "arrivesWAW=" + arrivesWAW +
                '}';
    }
}
