package com.kodilla.testing.shape;

public class Triangle implements Shape{

    @Override
    public String getShapeName() {
        return "Triangle";
    }
    @Override
    public Double getField(double x, double y) {
        return 100.1;
    }
}
