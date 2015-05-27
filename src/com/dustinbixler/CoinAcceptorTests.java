package com.dustinbixler;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Dustin on 5/26/2015.
 */
public class CoinAcceptorTests {
    @Test
    public void testacceptnickle(){
        CoinAcceptor acceptor = new CoinAcceptor();
        assertTrue("Acceptor accepts Nickles", acceptor.isAccepted("Nickle"));
    }
    @Test
    public void testacceptdimes(){
        CoinAcceptor acceptor = new CoinAcceptor();
        assertTrue("Acceptor accepts Dimes", acceptor.isAccepted("Dime"));
    }
    @Test
    public void testacceptquarters(){
        CoinAcceptor acceptor = new CoinAcceptor();
        assertTrue("Acceptor accepts Quarters", acceptor.isAccepted("Quarter"));
    }
    @Test
    public void testaccepthalfdollars(){
        CoinAcceptor acceptor = new CoinAcceptor();
        assertTrue("Acceptor accepts HalfDollars", acceptor.isAccepted("HalfDollar"));
    }
    @Test
    public void testacceptdollars(){
        CoinAcceptor acceptor = new CoinAcceptor();
        assertTrue("Acceptor accepts Dollars", acceptor.isAccepted("Dollar"));
    }
    @Test
    public void testrejectpennies(){
        CoinAcceptor acceptor = new CoinAcceptor();
        assertFalse("Acceptor rejects Pennies", acceptor.isAccepted("Penny"));
    }
  }
