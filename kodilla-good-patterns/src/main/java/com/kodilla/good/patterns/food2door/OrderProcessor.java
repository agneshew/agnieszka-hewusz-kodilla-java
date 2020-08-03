package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

        public static void main (String args[]) {

                OrderRequest orderRequest = new OrderRequest(new HealthyShop(),
                        new Product("Avocado", 12));

                boolean isOrdered = true;

                if (isOrdered) {
                        orderRequest.process(12);
                }
                else {
                        System.out.println("Re-enter the order");
                }
        }
}
