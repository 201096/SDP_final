package com.company.StoreStructure;

import com.company.Observer.Observer;
import com.company.Singleton.CustomerCounter;

import java.util.List;

public class StoreCustomers implements Observer {

    private String name;
    private int subfee;
    private boolean sub;

    public StoreCustomers(String name){
        this.name = name;
        this.subfee = 0;
        sub = false;
        CustomerCounter.getCustomerCounter().increase();
    }

    public void addsubfee(){
        subfee++;
          if(subfee == 1){
              sub = true;
        }
    }

    public void showobserver(){
        System.out.println("Welcome to our store, " + name + " you payed for temporary subscription, here are the activities that you are allowed from now ");
    }

    public void getSubscription() {
        if (sub) {
            System.out.println("Customer can get a subscription for VIP options");
        } else {
            System.out.println("Customer can't get a subscription");
        }
    }






    @Override
    public void handleEvent(List<String> subscription) {
        System.out.println("Welcome to the store, " + name + "\n we've got new brands of shoes in the store" +
                subscription + "\n===============================================" );
    }
}
