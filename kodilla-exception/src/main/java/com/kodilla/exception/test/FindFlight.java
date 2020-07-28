package com.kodilla.exception.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public void findFlight (Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> mapFlight = new HashMap<>();
        mapFlight.put("GDN", true);
        mapFlight.put("WAW", false);
        mapFlight.put("KRA", false);


        if (!(mapFlight.containsKey(flight.getDepartureAirport()) && mapFlight.containsKey(flight.getArrivalAirport()))) {
            throw new RouteNotFoundException();
            }
        else {
            System.out.println("Your airports are on the map :)");
            }
        System.out.println("Done!");
    }

}
