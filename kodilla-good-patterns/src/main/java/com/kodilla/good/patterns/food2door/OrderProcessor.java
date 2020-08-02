package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.challenges.OrderDto;

public class OrderProcessor {

    public Producer producer;

    boolean process(OrderRequest orderRequest,
                    int leadTimeInDays, double commission) {
        return true;
    }

    OrderRequest orderRequest = new OrderRequest(new Producer("HealthyShop", "123 New York"), new Product("Avocado", 12));

    boolean isOrdered = process(orderRequest, 14, 2.54);

}
