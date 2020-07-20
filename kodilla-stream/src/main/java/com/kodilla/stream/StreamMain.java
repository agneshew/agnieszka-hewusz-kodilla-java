package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Zosia", text -> "!!!" + text);
        poemBeautifier.beautify("Zosia", text -> text + ":)");
        poemBeautifier.beautify("Zosia", text -> toUpperCase(text));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }
}