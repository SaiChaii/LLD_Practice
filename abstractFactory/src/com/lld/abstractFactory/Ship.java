package com.lld.abstractFactory;

public class Ship implements Vehicle{
    @Override
    public void Drive(){
        System.out.println("Driving the ship");
    }
}
