package com.lld.factory;

public class Ship implements Transport{
    @Override
    public void deliver(){
        System.out.println("Travelling in ship");
    }
}
