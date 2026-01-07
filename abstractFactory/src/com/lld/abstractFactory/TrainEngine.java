package com.lld.abstractFactory;

public class TrainEngine implements Engine{
    @Override
    public void start(){
        System.out.println("TrainEngine started");
    }
}
