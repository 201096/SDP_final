package com.company.Strategy;

public class ProcessPayment {
    double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public ProcessPayment(double val){
        this.amount = Math.round(val*100)/100.0;
    }
    public void paymentDetails(){
        System.out.println("The payment is" + this.amount);
    }
}
