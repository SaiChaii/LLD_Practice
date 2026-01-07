package com.lld.singleton;

public class Client {
    private static Client client1= new Client();

    private Client(){};

    public static Client getClient(){
        return client1;
    }
}
