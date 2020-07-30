package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public User user;
    public boolean isSend;

    public OrderDto(final User user, final boolean isSend) {
        this.user = user;
        this.isSend = isSend;
    }

    public User getUser() {
        return user;
    }

    public boolean isSend() {
        return isSend;
    }
}
