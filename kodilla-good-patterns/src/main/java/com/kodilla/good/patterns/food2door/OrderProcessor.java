package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

        Producer producer;

        boolean process (OrderRequest orderRequest,
        int leadTimeInDays){
            return true;
        }

        OrderRequest orderRequest = new OrderRequest(new HealthyShop(), new Product("Avocado", 12));

        boolean isOrdered = process(orderRequest, 14);


}
