package com.lld.simplefactory;

public class Client {
    public static void main(String[] args){
        TransportFactory ship1=new TransportFactory();
        TransportFactory train1=new TransportFactory();

        ship1.createTransport("Ship").deliver();
        train1.createTransport("Train").deliver();
    }
}
