package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Producer{

    @Override
    public String producerName() {
        return "Healthy Shop";
    }

    @Override
    public String producerAddress() {
        return "Hollywood";
    }

    @Override
    public double commission() {
        return 5.5;
    }
}
