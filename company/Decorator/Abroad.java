package com.company.Decorator;

public class Abroad extends OrderDeliveryDecorator implements Order {
    public Abroad(Order newOrder) {
        super(newOrder);
    }


    public String getDescription() {
        return "Delivery for abroad customers";
    }

    public double getPrice() {
        return this.temporder.getPrice() + 2500.00;
    }
}
