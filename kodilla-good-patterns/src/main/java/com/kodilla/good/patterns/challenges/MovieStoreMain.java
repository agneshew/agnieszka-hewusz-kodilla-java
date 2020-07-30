package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main (String args[]) {
        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> moviesMap = movieStore.getMovies();

        String theResultOfMovies = moviesMap.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(theResultOfMovies);




    }
}
