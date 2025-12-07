package com.lld.factoryMethod;

public class Client {
    public static void main(String[] args) {
        TransportFactory ship= new ShipFactory();
        ship.planDelivery();

        TransportFactory train= new TrainFactory();
        train.planDelivery();
    }
}
