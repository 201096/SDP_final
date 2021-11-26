package com.company.Adopter;

public class VIPAdapter implements SimpleCustomer {

    SpecialCustomer cust;

    public VIPAdapter(SpecialCustomer cust){
        this.cust = cust;
    }

    @Override
    public void Buy() {
        cust.discount10();
        cust.ContestChance();
        cust.freeDelivery();
    }

}
