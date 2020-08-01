package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private Producer producer;
    private Product product;
    final ExtraFoodShop extraFoodShop;


    public OrderRequest(Producer producer, Product product, ExtraFoodShop extraFoodShop) {
        this.producer = producer;
        this.product = product;
        this.extraFoodShop = extraFoodShop;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public ExtraFoodShop getExtraFoodShop() {
        return extraFoodShop;
    }
}
