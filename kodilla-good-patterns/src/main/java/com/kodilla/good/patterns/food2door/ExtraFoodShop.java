package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop extends Order{

    Producer extraFoodShop = new Producer("ExtraFoodShop", "123 New York");

    public boolean process(int leadTimeInDays, double commission) {
        leadTimeInDays = 14;
        commission = 2.45;

        return true;
    }

    public Producer getExtraFoodShop() {
        return extraFoodShop;
    }

}

