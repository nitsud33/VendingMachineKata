package com.dustinbixler;

import java.math.BigDecimal;

/**
 * Created by Dustin on 5/26/2015.
 */
public class Transaction {
    private BigDecimal total = BigDecimal.valueOf(0.0);
    private BigDecimal coinreturn = BigDecimal.valueOf(0.0);

    CoinAcceptor acceptor = new CoinAcceptor();
    CoinToAmount coinToAmount = new CoinToAmount();

    public Transaction() {
        total = total.setScale(2);
    }

    public void insert(String coin){
        if(acceptor.isAccepted(coin)){
            total = total.add(coinToAmount.amount(coin));
        }
    }
    public String getMessage(){
        if (total.compareTo(BigDecimal.valueOf(0.0)) == 0) {
            return "INSERT COIN";
        }
        return "$" + total.toString();
    }
    public String buyCola(){
        if(total.compareTo(BigDecimal.valueOf(1.00)) >= 0){
            coinreturn = total.subtract(BigDecimal.valueOf(1.00));
            total = BigDecimal.valueOf(0.0);
            return "THANK YOU";
        }else{
            return "$1.00";
        }
    }
    public String buyChips(){
        if(total.compareTo(BigDecimal.valueOf(.50)) >= 0){
            coinreturn = total.subtract(BigDecimal.valueOf(.50));
            total = BigDecimal.valueOf(0.0);
            return "THANK YOU";
        }else{
            return "$.50";
        }
    }
    public String buyCandy(){
        if(total.compareTo(BigDecimal.valueOf(.65)) >= 0){
            coinreturn = total.subtract(BigDecimal.valueOf(.65));
            total = BigDecimal.valueOf(0.0);
            return "THANK YOU";
        }else{
            return "$.65";
        }
    }
    public BigDecimal getCoinReturn(){
        return coinreturn;
    }

}
