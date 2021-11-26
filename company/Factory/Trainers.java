package com.company.Factory;

public class Trainers extends FactoryShoes implements Shoes{
    @Override
    public void type() {
        System.out.println("great choice for gym sessions");
    }
}
