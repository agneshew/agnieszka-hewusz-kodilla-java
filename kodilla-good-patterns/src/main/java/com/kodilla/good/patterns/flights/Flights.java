package com.kodilla.good.patterns.flights;

import java.util.*;

public class Flights {

    private HashMap<String, List<String>> flightsMap = new HashMap<>();

    public HashMap<String, List<String>> getFlightsMap() {
        return flightsMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights1 = (Flights) o;
        return Objects.equals(flightsMap, flights1.flightsMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightsMap);
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flights=" + flightsMap +
                '}';
    }
}
