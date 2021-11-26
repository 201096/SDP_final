package com.company.Singleton;

public class OrdersCounter {
    private static OrdersCounter ordersCounter;
    private static int count = 0;

    public static synchronized OrdersCounter getOrdersCounter() {
        if (ordersCounter == null)
            ordersCounter = new OrdersCounter();
        return ordersCounter;
    }

    private OrdersCounter() {

    }

    public void increase() {
        count ++;
    }
    public void decrease() {
        count --;
    }
    public void showCounter() {
        System.out.println("The number of orders: " + count);
    }
}