package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class ExtraFoodShop extends Order{

    @Override
    public boolean process(int leadTimeInDays, double commission) {
        leadTimeInDays = 14;
        commission = 2.45;

        return true;
    }
}

