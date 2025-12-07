package com.lld.simplefactory;

public class Ship implements Transport{
    public Ship(){
        System.out.println("Ship is created");
    }
    @Override
    public void deliver(){
        System.out.println("Travelling in ship");
    }
}
