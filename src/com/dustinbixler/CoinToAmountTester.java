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
    @Test
    public void testNullInsert(){
        CoinToAmount coinToAmount = new CoinToAmount();
        assertEquals(BigDecimal.valueOf(0.0), coinToAmount.amount(""));
    }
    @Test
    public void testNullInsert2(){
        CoinToAmount coinToAmount = new CoinToAmount();
        assertEquals(BigDecimal.valueOf(0.0), coinToAmount.amount(null));
    }
    @Test
    public void testPennyInsert(){
        CoinToAmount coinToAmount = new CoinToAmount();
        assertEquals(BigDecimal.valueOf(0.0), coinToAmount.amount("penny"));

    }
    @Test
    public void testDimeTo10Cents(){
        CoinToAmount coinToAmount = new CoinToAmount();
        assertEquals(BigDecimal.valueOf(0.10), coinToAmount.amount("Dime"));
    }
    @Test
    public void testQuarterTo25Cents(){
        CoinToAmount coinToAmount = new CoinToAmount();
        assertEquals(BigDecimal.valueOf(0.25), coinToAmount.amount("Quarter"));
    }
    @Test
    public void testHalfDollarTo50Cents(){
        CoinToAmount coinToAmount = new CoinToAmount();
        assertEquals(BigDecimal.valueOf(0.50), coinToAmount.amount("HalfDollar"));
    }
    @Test
    public void testDollarTo100Cents(){
        CoinToAmount coinToAmount = new CoinToAmount();
        assertEquals(BigDecimal.valueOf(1), coinToAmount.amount("Dollar"));
    }
}
