package com.kodilla.good.patterns.flights;

import java.util.*;

public class Flights {
    private List<Flight> flights = new ArrayList<>();

    public Flights() {
        flights.add(new Flight("KRK", "WAW"));
        flights.add(new Flight("KRK", "WRO"));
        flights.add(new Flight("WRO", "WAW"));
    }
    public List<Flight> getFlights() {
        return flights;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flights=" + flights +
                '}';
    }
}
