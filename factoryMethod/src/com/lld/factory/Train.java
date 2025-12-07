package com.lld.factory;

public class Train implements Transport{
    @Override
    public void deliver(){
        System.out.println("Travelling in a train");
    }
}
