package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", BigDecimal.valueOf(38_000_000));
        Country germany = new Country("Germany", BigDecimal.valueOf(83_000_000));

        Set<Country> europeanCountries = new HashSet<>();
        europeanCountries.add(poland);
        europeanCountries.add(germany);

        Continent europe = new Continent();
        europe.setCountrySet(europeanCountries);

        Country japan = new Country("Japan", BigDecimal.valueOf(126_000_000));
        Country thailand = new Country("Thailnad", BigDecimal.valueOf(69_000_000));

        Set<Country> asianCountries = new HashSet<>();
        asianCountries.add(japan);
        asianCountries.add(thailand);

        Continent asia = new Continent();
        asia.setCountrySet(asianCountries);

        World world = new World();
        Set<Continent> continents = new HashSet<>();
        continents.add(europe);
        continents.add(asia);
        world.setContinentsOnTheWorld(continents);
        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        BigDecimal expectedPeople = new BigDecimal(316_000_000);
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
