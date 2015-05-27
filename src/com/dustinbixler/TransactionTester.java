package com.dustinbixler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dustin on 5/26/2015.
 */
public class TransactionTester {
    @Test
    public void testNoCoinsInserted(){
        Transaction transaction = new Transaction();
        transaction.insert(null);
        assertEquals("INSERT COIN", transaction.getMessage());
    }
    @Test
    public void testNoCoinsInserted2(){
        Transaction transaction = new Transaction();
        transaction.insert("");
        assertEquals("INSERT COIN", transaction.getMessage());
    }
    @Test
    public void testNickleInserted(){
        Transaction transaction = new Transaction();
        transaction.insert("Nickle");
        assertEquals("$0.05", transaction.getMessage());
    }
    @Test
    public void test2NicklesInserted(){
        Transaction transaction = new Transaction();
        transaction.insert("Nickle");
        transaction.insert("Nickle");
        assertEquals("$0.10", transaction.getMessage());
    }
    @Test
    public void testDimeInserted(){
        Transaction transaction = new Transaction();
        transaction.insert("Dime");
        assertEquals("$0.10", transaction.getMessage());
    }
    @Test
    public void testQuarterInserted(){
        Transaction transaction = new Transaction();
        transaction.insert("Quarter");
        assertEquals("$0.25", transaction.getMessage());
    }
    @Test
    public void testRandomChangeInserted(){
        Transaction transaction = new Transaction();
        transaction.insert("Quarter");
        transaction.insert("Dime");
        transaction.insert("Quarter");
        transaction.insert("Dime");
        transaction.insert("Nickle");
        transaction.insert("Nickle");
        transaction.insert("Penny");
        transaction.insert("");
        transaction.insert("Quarter");
        assertEquals("$1.05", transaction.getMessage());
    }
    @Test
    public void testBuyCola(){
        Transaction transaction = new Transaction();
        assertEquals("$1.00", transaction.buyCola());
        assertEquals("INSERT COIN", transaction.getMessage());
    }
    @Test
    public void testBuyColaWithMoney(){
        Transaction transaction = new Transaction();
        transaction.insert("Quarter");
        transaction.insert("Quarter");
        transaction.insert("Quarter");
        transaction.insert("Quarter");
        assertEquals("THANK YOU", transaction.buyCola());
        assertEquals("INSERT COIN", transaction.getMessage());
    }

}
