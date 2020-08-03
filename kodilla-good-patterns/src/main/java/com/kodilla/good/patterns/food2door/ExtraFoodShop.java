package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Producer {

    @Override
    public String producerName() {
        return "Extra Food Shop";
    }

    @Override
    public String producerAddress() {
        return "New York";
    }

    @Override
    public double commission() {
        return 1.5;
    }
}
