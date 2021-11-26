package com.company.Decorator;
import com.company.Singleton.*;

abstract class OrderDeliveryDecorator {
    protected Order temporder;
    public OrderDeliveryDecorator(Order newOrder) {
        this.temporder = newOrder;
    }

    public String getDescription() {
        return this.temporder.getDescription();
    }


    public double getPrice() {
        return this.temporder.getPrice();
    }
}
