package com.lld.abstractFactory;

public class Train implements Vehicle{
    @Override
    public void Drive(){
        System.out.println("Driving the vehicle");
    }
}
