package com.dustinbixler;

/**
 * Created by Dustin on 5/26/2015.
 */
public class CoinAcceptor {
    public boolean isAccepted(String coin){
        if (coin == null){
            return false;
        }
        if (coin.equals("Nickle")){
            return true;
        }
        if (coin.equals("Dime")){
            return true;
        }
        if (coin.equals("Quarter")){
            return true;
        }
        if (coin.equals("HalfDollar")){
            return true;
        }
        if (coin.equals("Dollar")){
            return true;
        }
        return false;
    }
}
