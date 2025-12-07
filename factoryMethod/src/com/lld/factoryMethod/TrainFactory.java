package com.lld.factoryMethod;

public class TrainFactory extends TransportFactory{
    @Override
    public Transport create(){
        return new Train();
    }
}
