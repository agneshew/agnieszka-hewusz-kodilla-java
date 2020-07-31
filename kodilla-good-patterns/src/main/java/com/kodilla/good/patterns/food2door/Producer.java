package com.kodilla.good.patterns.food2door;

public class Producer {
    private final String producerName;
    private final String producerAddress;

    public Producer(String producerName, String producerAddress) {
        this.producerName = producerName;
        this.producerAddress = producerAddress;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProducerAddress() {
        return producerAddress;
    }
}
