package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FlightsMain {

    public static void main (String args[]) {
        ArrivesGDN arrivesGDNList = new ArrivesGDN();
        ArrivesKRK arrivesKRKList = new ArrivesKRK();
        ArrivesWAW arrivesWAWList = new ArrivesWAW();

        Flights flights = new Flights();

        HashMap<String, List<String>> flightsMap = flights.getFlightsMap();
        flightsMap.put("GDN", arrivesGDNList.getArrivesGDN());
        flightsMap.put("WAW", arrivesWAWList.getArrivesWAW());
        flightsMap.put("KRK", arrivesKRKList.getArrivesKRK());

        List flightsFromGDN = flightsMap.entrySet()
                .stream()
                .filter(e -> e.getKey().equals("GDN"))
                .collect(Collectors.toList());

        System.out.println(flightsFromGDN);

        List flightsToGDN = flightsMap.entrySet()
                .stream()
                .filter(e -> e.getValue().contains("GDN"))
                .collect(Collectors.toList());

        System.out.println(flightsToGDN);

        Predicate<Map.Entry<String, List<String>>> con1 = e -> e.getKey().equals("GDN");
        Predicate<Map.Entry<String, List<String>>> con2 = e -> e.getValue().contains("GDN");

        List flightsThroughGDN = flightsMap.entrySet()
                .stream()
                .filter(con1.or(con2))
                .collect(Collectors.toList());

        System.out.println(flightsThroughGDN);


    }
}
