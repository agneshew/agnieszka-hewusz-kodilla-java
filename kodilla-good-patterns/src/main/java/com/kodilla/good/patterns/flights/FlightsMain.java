package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.List;

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

        System.out.println(flightsMap);

    }
}
