package com.kodilla.exception.test;

public class FlightMain {
    public static void main (String args[]) {

        FindFlight newRoute = new FindFlight();

        try {
            newRoute.findFlight(new Flight("GDN", "GDN"));
        }
        catch (RouteNotFoundException e) {
            System.out.println("Exception!");
        }

    }
}
