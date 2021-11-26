package com.company.Factory;

public class FactoryShoes implements Factory {

    @Override
    public Shoes createCleats() {
        return new Cleats();
    }

    @Override
    public Shoes createTrainers() {
        return new Trainers();
    }

    @Override
    public Shoes createSneakers() {
        return new Sneakers();
    }
}
