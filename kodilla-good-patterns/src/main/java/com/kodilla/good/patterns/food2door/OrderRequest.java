package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private Producer producer;
    private Product product;

    public OrderRequest(Producer producer, Product product) {
        this.producer = producer;
        this.product = product;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }
}
