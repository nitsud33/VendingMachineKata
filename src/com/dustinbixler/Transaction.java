package com.dustinbixler;

import java.math.BigDecimal;

/**
 * Created by Dustin on 5/26/2015.
 */
public class Transaction {
    private BigDecimal total = BigDecimal.valueOf(0.0);
    CoinAcceptor acceptor = new CoinAcceptor();
    CoinToAmount coinToAmount = new CoinToAmount();

    public void insert(String coin){
        if(acceptor.isAccepted(coin)){

        }
    }
    public String getMessage(){
        return "INSERT COIN";
    }
}
