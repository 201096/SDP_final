package com.company.Adopter;

public  class Customer implements SimpleCustomer {

    @Override
    public void Buy() {
        System.out.println("Simple Customer buy the products by fixed stand price");

    }
}
