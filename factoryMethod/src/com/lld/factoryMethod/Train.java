package com.lld.factoryMethod;

public class Train implements Transport{
    @Override
    public void deliver(){
        System.out.println("Train is delivering");
    }
}
