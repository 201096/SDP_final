package com.company.Adopter;

public class VIP implements SpecialCustomer {
    @Override
    public void discount10() {
        System.out.println("-10% from price");
    }

    @Override
    public void freeDelivery() {
        System.out.println("VIP customers get free delivery within 2 days");
    }

    @Override
    public void ContestChance() {
        System.out.println("U got the chance to participate in the contest where u probably will win 2 tickets for a trip to COALA-LUMPUR");
    }

}
