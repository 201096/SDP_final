package com.company.Decorator;

public class Incity extends OrderDeliveryDecorator implements Order {
    public Incity(Order newOrder) {
        super(newOrder);
    }


    public String getDescription() {
        return "The delivery for customers in Nur-Sultan";
    }

    public double getPrice() {
        return this.temporder.getPrice() + 1500.50;
    }
}
