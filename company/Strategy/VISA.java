package com.company.Strategy;

public class VISA extends ProcessPayment implements Payment {
    String CardName, ExpirationDate, CreditCardNumber;
    public VISA(double val, String CardName, String ExpirationDate, String CreditCardNumber) {
        super(val);
        this.CardName = CardName;
        this.CreditCardNumber = CreditCardNumber;
        this.ExpirationDate = ExpirationDate;
    }

    @Override
    public void paymentDetails() {
        System.out.println("The payment amount is: "+ this.amount + " by the VISA card "+ this.CardName +
                " the credit card name " + this.CreditCardNumber + " with expiration date " + this.ExpirationDate);
    }

    @Override
    public void ChoosePayment() {
        System.out.println("Make a payment using VISA cards");
    }
}
