package com.lld.factoryMethod;

public abstract class TransportFactory {
    public abstract Transport create();

    public void planDelivery(){
        Transport t=create();
        t.deliver();
    }
}
