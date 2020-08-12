package com.kodilla.good.patterns.flights;

public class FlightMain {
    public static void main (String[] args) {
        FlightsSearch flightsSearch = new FlightsSearch();

        flightsSearch.findFlightTo("WAW");

        flightsSearch.findFlightFrom("KRK");

        flightsSearch.findFlightBy("KRK", "WRO", "WAW");
    }
}
