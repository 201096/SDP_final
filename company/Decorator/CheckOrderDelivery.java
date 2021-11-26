package com.company.Decorator;

public class CheckOrderDelivery implements Order {
    @Override
    public String getDescription() {
        return "This price is always included for the delivery";
    }

    @Override
    public double getPrice() {
        return 1000.00;
    }
}
