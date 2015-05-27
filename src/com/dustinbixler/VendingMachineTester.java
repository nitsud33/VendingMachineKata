package com.dustinbixler;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dustin on 5/26/2015.
 */
public class VendingMachineTester {
    @Test
    public void testNullCoinsInserted(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert(null);
        assertEquals("INSERT COIN", vendingMachine.readDisplay());
    }
    @Test
    public void testNoCoinsInserted2(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("");
        assertEquals("INSERT COIN", vendingMachine.readDisplay());
    }
    @Test
    public void testNickleInserted(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Nickle");
        assertEquals("$0.05", vendingMachine.readDisplay());
    }
    @Test
    public void test2NicklesInserted(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Nickle");
        vendingMachine.insert("Nickle");
        assertEquals("$0.10", vendingMachine.readDisplay());
    }
    @Test
    public void testDimeInserted(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Dime");
        assertEquals("$0.10", vendingMachine.readDisplay());
    }
    @Test
    public void testQuarterInserted(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Quarter");
        assertEquals("$0.25", vendingMachine.readDisplay());
    }
    @Test
    public void testRandomChangeInserted(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Dime");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Dime");
        vendingMachine.insert("Nickle");
        vendingMachine.insert("Nickle");
        vendingMachine.insert("Penny");
        vendingMachine.insert("");
        vendingMachine.insert("Quarter");
        assertEquals("$1.05", vendingMachine.readDisplay());
    }
    @Test
    public void testBuyCola(){
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("$1.00", vendingMachine.buyCola());
        assertEquals("INSERT COIN", vendingMachine.readDisplay());
    }
    @Test
    public void testBuyColaWithMoney(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        assertEquals("THANK YOU", vendingMachine.buyCola());
        assertEquals("INSERT COIN", vendingMachine.readDisplay());
    }
    @Test
    public void testBuyChips(){
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("$.50", vendingMachine.buyChips());
        assertEquals("INSERT COIN", vendingMachine.readDisplay());
    }
    @Test
    public void testBuyChipsWithMoney(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        assertEquals("THANK YOU", vendingMachine.buyChips());
        assertEquals("INSERT COIN", vendingMachine.readDisplay());
    }
    @Test
    public void testBuyCandy(){
        VendingMachine vendingMachine = new VendingMachine();
        assertEquals("$.65", vendingMachine.buyCandy());
        assertEquals("INSERT COIN", vendingMachine.readDisplay());
    }
    @Test
    public void testBuyCandyWithMoney(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        assertEquals("THANK YOU", vendingMachine.buyCandy());
        assertEquals("INSERT COIN", vendingMachine.readDisplay());
    }
    @Test
    public void testMakeChange1(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.buyCandy();
        assertEquals(BigDecimal.valueOf(0.35), vendingMachine.getCoinReturn());
    }
    @Test
    public void testMakeChange2(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Dime");
        vendingMachine.buyChips();
        assertEquals(BigDecimal.valueOf(0.35), vendingMachine.getCoinReturn());
    }
    @Test
    public void testMakeChange3(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Dime");
        vendingMachine.insert("Nickle");
        vendingMachine.buyCola();
        assertEquals(BigDecimal.valueOf(0.15), vendingMachine.getCoinReturn());
    }
    @Test
    public void testReturnMoney(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insert("Quarter");
        vendingMachine.insert("Dime");
        vendingMachine.insert("Nickle");
        vendingMachine.insert("Nickle");
        vendingMachine.returnMoney();
        assertEquals(BigDecimal.valueOf(0.45), vendingMachine.getCoinReturn());
    }
}
