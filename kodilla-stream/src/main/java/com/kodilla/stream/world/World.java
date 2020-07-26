package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {

    private Set<Continent> continentsOnTheWorld = new HashSet<>();

    public Set<Continent> getContinentsOnTheWorld() {
        return continentsOnTheWorld;
    }

    public void setContinentsOnTheWorld(Set<Continent> continentsOnTheWorld) {
        this.continentsOnTheWorld = continentsOnTheWorld;
    }

    public BigDecimal getPeopleQuantity(List<Country> countries) {
        BigDecimal peopleQuantity = new BigDecimal("0");
        return peopleQuantity;
    }
}