package com.dustinbixler;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Dustin on 5/26/2015.
 */
public class AcceptCoinTester {
    @Test
    public void testacceptnickle(){
        AcceptCoin acceptor = new AcceptCoin();
        assertTrue("Acceptor accepts nickles", acceptor.accept("Nickle"));
    }
    public void testacceptdimes(){
        AcceptCoin acceptor = new AcceptCoin();
        assertTrue("Acceptor accepts Dimes", acceptor.accept("Dimes"));
    }
    public void testacceptquarters(){
        AcceptCoin acceptor = new AcceptCoin();
        assertTrue("Acceptor accepts Dimes", acceptor.accept("Quarters"));
    }
    public void testaccepthalfdollars(){
        AcceptCoin acceptor = new AcceptCoin();
        assertTrue("Acceptor accepts Dimes", acceptor.accept("HalfDollar"));
    }
    public void testacceptdollars(){
        AcceptCoin acceptor = new AcceptCoin();
        assertTrue("Acceptor accepts Dimes", acceptor.accept("Dollar"));
    }
}
