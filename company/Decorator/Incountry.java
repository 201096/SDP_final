package com.company.Decorator;

public class Incountry extends OrderDeliveryDecorator implements Order {
    public Incountry(Order newOrder) {
        super(newOrder);
    }


    public String getDescription() {
        return "The delivery for the customers from cities in Kazakhstan";
    }

    public double getPrice() {
        return this.temporder.getPrice() + 2000.50;
    }
}
