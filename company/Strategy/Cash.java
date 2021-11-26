package com.company.Strategy;

public class Cash extends ProcessPayment implements Payment {
    public Cash(double val) {
        super(val);
    }

    public void paymentDetails(){
        System.out.println("The payment amount is " + this.amount);

    }

    @Override
    public void ChoosePayment() {
        System.out.println("Make a payment using Cash");
    }
}