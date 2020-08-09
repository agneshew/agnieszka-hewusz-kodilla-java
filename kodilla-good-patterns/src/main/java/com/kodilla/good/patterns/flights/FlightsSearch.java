package com.kodilla.good.patterns.flights;

import java.util.stream.Collectors;

public class FlightsSearch {

        public void findFlightFrom (String from) {
            Flights flights = new Flights();
            flights.getFlights().stream()
                    .filter(e -> e.getArrival().equals(from))
                    .collect(Collectors.toList());
            System.out.println(flights);
        }
        public void findFlightTo(String to) {
            Flights flights = new Flights();
            flights.getFlights().stream()
                    .filter(e -> e.getDeparture().contains(to))
                    .collect(Collectors.toList());
            System.out.println(flights);
        }
        public void findFlightBy (String from, String by, String to) {
            Flights flights = new Flights();
            flights.getFlights().stream()
                    .filter(e -> e.getDeparture().contains(by))
                    .collect(Collectors.toList());
            System.out.println(flights);
        }

}