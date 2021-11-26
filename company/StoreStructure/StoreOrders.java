package com.company.StoreStructure;

import com.company.Decorator.*;
import com.company.Factory.Cleats;
import com.company.Factory.*;
import com.company.Factory.Sneakers;
import com.company.Factory.Trainers;
import com.company.Observer.Observed;
import com.company.Observer.Observer;
import com.company.Strategy.*;
import com.company.Adopter.*;
import com.company.Singleton.OrdersCounter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreOrders implements Observed {

    private int del;
    Order order;
    Payment payment;
    SimpleCustomer simpcust;
    FactoryShoes fack;
    private Scanner scan = new Scanner(System.in);


    public  StoreOrders(){
        this.del = 0;
        order = new CheckOrderDelivery();
        fack = new FactoryShoes();
       OrdersCounter.getOrdersCounter().increase();
    }

    public void proceed_delivery() {
        del++;
        if(del ==2) {
            order = new Incity (order);
        }
        if(del == 3) {
            order =  new Incountry(order);
        }
        if(del == 4) {
            order =  new Abroad(order);
        }
    }

   /* public void setShoes(int i){
        if (i == 1){
            fack = new Sneakers(fack);
        }
        else if (i == 2){
            fack = new Cleats(fack);
        }
        else if (i == 3){
            fack = new Trainers(fack);
        }
    }*/

    public void setPayment(int i){
        if (i == 1){
            int n = scan.nextInt();
            payment = new Cash(n);
        }
        else if(i == 2){
            int n = scan.nextInt();
            String row1 = scan.nextLine();
            String row2 = scan.nextLine();
            String row3 = scan.nextLine();
            payment = new DebitCard(n,row1,row2,row3);
        }
        else if (i == 3){
            int n = scan.nextInt();
            String row1 = scan.nextLine();
            String row2 = scan.nextLine();
            String row3 = scan.nextLine();
            payment = new VISA(n,row1,row2,row3);
        }
    }


    public void getDescription(){
        System.out.println(order.getDescription());
    }
    public void getPrice(){
        System.out.println(order.getPrice());
    }

    public void addShoes_brands(String brands)  {
        this.shoes_brands.add(brands);
        notifyObservers();
    }

    public void setShoes_brands(String brands) {
        this.shoes_brands.remove(brands);
        notifyObservers();
    }

    List<String> shoes_brands = new ArrayList<String>();
    List<Observer> customers = new ArrayList<Observer>();

    public void order() {
        System.out.println("You've got a new order");
    }



    @Override
    public void addObserver(Observer observer) {
        this.customers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.customers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: customers){
            observer.handleEvent(this.shoes_brands);
        }

    }
}


