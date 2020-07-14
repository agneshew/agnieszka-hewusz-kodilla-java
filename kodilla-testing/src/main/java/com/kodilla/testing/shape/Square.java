package com.kodilla.testing.shape;

public class Square implements Shape{

    @Override
    public String getShapeName() {
        return "Square";
    }
    @Override
    public Double getField(double x, double y) {
        return 100.1;
    }

}
