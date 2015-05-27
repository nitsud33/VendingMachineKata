package com.dustinbixler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dustin on 5/26/2015.
 */
public class TransactionTester {
    @Test
    public void testnocoinsinserted(){
        Transaction transaction = new Transaction();
        transaction.insert(null);
        assertEquals("INSERT COIN", transaction.getMessage());
    }
}
