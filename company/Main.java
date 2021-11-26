package com.company;

import com.company.StoreStructure.StoreCustomers;
import com.company.Strategy.*;
import com.company.Adopter.*;
import com.company.Decorator.*;
import com.company.Singleton.*;
import com.company.StoreStructure.StoreOrders;
import com.company.Factory.*;


public class Main {

    public static void main(String[] args) {

       StoreOrders storders = new StoreOrders();
       /*storders.addShoes_brands("Adidas");
        storders.addShoes_brands("Nike");
        storders.addShoes_brands("Reebok");
        storders.addShoes_brands("Puma");
        storders.addShoes_brands("UnderArmour");
        storders.addShoes_brands("Anta");

        storders.proceed_delivery();
        storders.proceed_delivery();
        storders.proceed_delivery();
        storders.proceed_delivery();
        //storders.getPrice();
        //storders.getDescription();
        //OrdersCounter.getOrdersCounter().showCounter();
*/
        System.out.println("................................................");
        //storders.setPayment(2);
      


       /* Factory factory = new FactoryShoes();
        Shoes type1 = factory.createCleats();
        Shoes type2 = factory.createSneakers();
        Shoes type3 = factory.createTrainers();
         type1.type();
         type2.type(); */


        StoreCustomers cus1 = new StoreCustomers("Danik");
        StoreCustomers cus2 = new StoreCustomers("Fara");
        StoreCustomers cus3 = new StoreCustomers("CJ");

        cus1.showobserver();
        cus1.addsubfee();
        cus1.getSubscription();

        VIP vip = new VIP();
        Customer customer = new Customer();
        SimpleCustomer VIPpromo =  new VIPAdapter(vip);
        System.out.println("VIP customers can:");
        vip.discount10();
        vip.freeDelivery();
        vip.ContestChance();


        //System.out.println("Simple customers can:");
        //customer.Buy();
        //System.out.println("Our temporary subscribers who get the promo:");
        //VIPpromo.Buy();





        System.out.println("..................................................");


        //storders.addObserver(cus1);
        //storders.addObserver(cus2);
        //storders.notifyObservers();




       // CustomerCounter.getCustomerCounter().showCounter();





























/*
        PaymentType paymentType = new PaymentType();

        paymentType.setPayment(new VISA(25000, "Zhusan", "25-12-13", "4173419847108470"));
        paymentType.executePayment();
        paymentType.paymentDetails();

        paymentType.setPayment(new DebitCard(200000.00, "Kaspi","23-12-12", "25330908770320" ));
        paymentType.executePayment();
        paymentType.paymentDetails();

        paymentType.setPayment(new Cash(16000.00));
        paymentType.executePayment();
        paymentType.paymentDetails();


*/
/*
        VIP vip = new VIP();
        Customer customer = new Customer();
        SimpleCustomer VIPpromo =  new VIPAdapter(vip);
        System.out.println("VIP customers can:");
        vip.discount10();
        vip.freeDelivery();
        System.out.println("Simple customers can:");
        customer.Buy();
        System.out.println("Our temporary subscribers who get the promo:");
        VIPpromo.Buy();
        */

    }
}
