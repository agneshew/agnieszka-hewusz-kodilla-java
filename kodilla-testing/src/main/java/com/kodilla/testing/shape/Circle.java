package com.kodilla.testing.shape;

public class Circle implements Shape {

    @Override
    public String getShapeName() {
        return "Circle";
    }
    @Override
    public Double getField(double x, double y) {
        return 100.1;
    }
}
