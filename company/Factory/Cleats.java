package com.company.Factory;

public class  Cleats extends FactoryShoes implements Shoes{
    @Override
    public void type() {
        System.out.println(" cleats are very comfortable shoes for outside and greatly combined with overall outfit");
    }
}
