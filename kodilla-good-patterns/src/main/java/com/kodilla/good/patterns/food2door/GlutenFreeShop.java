package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Producer{


    @Override
    public String producerName() {
        return "Gluten Free Shop";
    }

    @Override
    public String producerAddress() {
        return "Los Angeles";
    }

    @Override
    public double commission() {
        return 2.0;
    }
}
