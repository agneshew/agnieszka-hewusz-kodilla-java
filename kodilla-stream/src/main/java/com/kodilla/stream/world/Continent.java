package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private Set<Country> countrySet = new HashSet<>();

    public Set<Country> getCountrySet() {
        return countrySet;
    }

    public void setSountrySet(Set<Country> countrySet){
        this.countrySet = countrySet;
    }
}