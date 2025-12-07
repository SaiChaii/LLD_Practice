package com.lld.factory;

public class TransportFactory {
    Transport createTransport(String s){
        switch (s){
            case "Ship":
                return new Ship();
            case "Train":
                return new Train();
            default:
                System.out.println("Please enter valid class name");
                return null;
        }
    }
}
