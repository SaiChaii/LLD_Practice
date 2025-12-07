package com.lld.factoryMethod;

public class Ship implements Transport{
    @Override
    public void deliver(){
        System.out.println("This is for delivering via ship");
    }
}
