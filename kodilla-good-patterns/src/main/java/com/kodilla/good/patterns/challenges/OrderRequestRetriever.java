package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Joe", "Black", "123 New York");
        Product product = new Product("Computer", 1);

        LocalDate orderDate = LocalDate.of(2020, 07, 20);

        return new OrderRequest(user, orderDate, product);
    }
}
