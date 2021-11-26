package com.company.Strategy;

public class PaymentType {
    Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void executePayment(){
        payment.ChoosePayment();
    }

    public void paymentDetails() {payment.paymentDetails();}
}
