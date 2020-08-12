package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightsSearch {

        public void findFlightFrom (String from) {
            Flights flights = new Flights();
            List<Flight> listFrom = flights.getFlights().stream()
                    .filter(e -> e.getArrival().equals(from))
                    .collect(Collectors.toList());
            System.out.println(listFrom);
        }
        public void findFlightTo(String to) {
            Flights flights = new Flights();
            List<Flight> listTo = flights.getFlights().stream()
                    .filter(e -> e.getDeparture().contains(to))
                    .collect(Collectors.toList());

            System.out.println(listTo);
        }
        public void findFlightBy (String from, String by, String to) {
            Flights flights = new Flights();
            List<Flight> list1 = flights.getFlights().stream()
                    .filter(e -> e.getArrival().contains(from))
                    .filter(e ->e.getDeparture().contains(by))
                    .collect(Collectors.toList());

            List<Flight> list2 = flights.getFlights().stream()
                    .filter(e -> e.getArrival().contains(by))
                    .filter(e ->e.getDeparture().contains(to))
                    .collect(Collectors.toList());
            list1.addAll(list2);
            System.out.println(list1);
        }
}