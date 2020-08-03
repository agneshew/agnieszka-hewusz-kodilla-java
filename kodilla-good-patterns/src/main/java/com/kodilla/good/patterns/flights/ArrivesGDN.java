package com.kodilla.good.patterns.flights;

import java.util.Arrays;
import java.util.List;

public class ArrivesGDN  {

    private List<String> arrivesGDN = Arrays.asList("WAW", "KRK", "WRO", "LUZ");

    public List<String> getArrivesGDN() {
        return arrivesGDN;
    }

    @Override
    public String toString() {
        return "ArrivesGDN{" +
                "arrivesGDN=" + arrivesGDN +
                '}';
    }
}
