package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
        europe.setSountrySet(europeanCountries);

        Country japan = new Country("Japan", BigDecimal.valueOf(126_000_000));
        Country thailand = new Country("Thailnad", BigDecimal.valueOf(69_000_000));

        Set<Country> asianCountries = new HashSet<>();
        asianCountries.add(japan);
        asianCountries.add(thailand);

        Continent asia = new Continent();
        asia.setSountrySet(asianCountries);

        World world = new World();
        Set<Continent> continents = new HashSet<>();
        continents.add(europe);
        continents.add(asia);
        world.setContinentsOnTheWorld(continents);
        //When
        List<Country> countries = world.getContinentsOnTheWorld()
                .stream()
                .flatMap(c->c.getCountrySet().stream())
                .collect(Collectors.toList());
        BigDecimal totalPeople = countries.stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        //Then
        BigDecimal expectedPeople = new BigDecimal(316_000_000);
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
