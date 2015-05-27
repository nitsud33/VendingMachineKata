package com.dustinbixler;

/**
 * Created by Dustin on 5/26/2015.
 */
public class AcceptCoin {
    public boolean accept(String coin){
        if (coin.equals("Nickle")){
            return true;
        }
        if (coin.equals("Dime")){
            return true;
        }

        return false;
    }
}
