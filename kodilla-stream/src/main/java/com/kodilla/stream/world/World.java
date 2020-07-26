package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class World {

    private Set<Continent> continentsOnTheWorld = new HashSet<>();

    public void setContinentsOnTheWorld(Set<Continent> continentsOnTheWorld) {
        this.continentsOnTheWorld = continentsOnTheWorld;
    }
    public BigDecimal getPeopleQuantity() {
        List<Country> countries = this.continentsOnTheWorld
                .stream()
                .flatMap(c->c.getCountrySet().stream())
                .collect(Collectors.toList());
        BigDecimal totalPeople = countries.stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return totalPeople;
    }
}