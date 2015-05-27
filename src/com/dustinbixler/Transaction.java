package com.dustinbixler;

/**
 * Created by Dustin on 5/26/2015.
 */
public class Transaction {
    private float total = 0;
    CoinAcceptor acceptor = new CoinAcceptor();


    public void insert(String coin){
        if(acceptor.isAccepted(coin)){

        }
    }
    public String getMessage(){
        return "INSERT COIN";
    }
}
