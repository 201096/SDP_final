package com.company.Singleton;

public class CustomerCounter {
    private static CustomerCounter customerCounter;
    private static int count = 0;

    public static synchronized CustomerCounter getCustomerCounter() {
        if (customerCounter == null)
            customerCounter = new CustomerCounter();
        return customerCounter;
    }

    private CustomerCounter() {

    }

    public void increase() {
        count ++;
    }
    public void decrease() {
        count --;
    }
    public void showCounter() {
        System.out.println("The amount of customers: " + count  );
    }
}