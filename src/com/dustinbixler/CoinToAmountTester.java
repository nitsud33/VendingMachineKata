package com.dustinbixler;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dustin on 5/26/2015.
 */
public class CoinToAmountTester {
    @Test
    public void testNickleTo5Cents(){
        CoinToAmount coinToAmount = new CoinToAmount();
        assertEquals(BigDecimal.valueOf(0.05), coinToAmount.amount("Nickle"));
    }
    public void testNullInsert(){
        CoinToAmount coinToAmount = new CoinToAmount();
        assertEquals(BigDecimal.valueOf(0.0), coinToAmount.amount(""));
    }
}
