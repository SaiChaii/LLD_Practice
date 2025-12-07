package com.lld.factory;

public class Train implements Transport{
    public Train(){
        System.out.println("Train is created");
    }
    @Override
    public void deliver(){
        System.out.println("Travelling in a train");
    }
}
