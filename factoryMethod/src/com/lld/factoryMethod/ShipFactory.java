package com.lld.factoryMethod;

public class ShipFactory extends TransportFactory{
    @Override
    public Transport create(){
        return new Ship();
    }
}
