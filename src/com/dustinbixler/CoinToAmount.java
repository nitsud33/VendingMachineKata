package com.dustinbixler;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dustin on 5/26/2015.
 */
public class CoinToAmount {
    private Map<String,BigDecimal> coinmap = new HashMap<String,BigDecimal>();

    public CoinToAmount(){
        coinmap.put("Nickle", BigDecimal.valueOf(.05));
        coinmap.put("Dime", BigDecimal.valueOf(.10));
        coinmap.put("Quarter", BigDecimal.valueOf(.25));
        coinmap.put("HalfDollar", BigDecimal.valueOf(.50));
        coinmap.put("Dollar", BigDecimal.valueOf(1.00));
    }
    public BigDecimal amount(String coin){
        if(coinmap.containsKey(coin)){
            return coinmap.get(coin);
        }
        return BigDecimal.valueOf(0.0);
    }
}
