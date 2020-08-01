package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Shop {

    Producer extraFoodShop = new Producer("ExtraFoodShop", "123 New York");

    @Override
    public boolean process(int leadTimeInDays, double commission) {
        return false;
    }
}

