package com.se77.java9.examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class NewStreamFeaturesTest {

    /**
     * Shows the new Primitive-Stream iterator, which mimics the old school for-loop
     */
    @Test
    public void testIterate(){
        int max = IntStream.iterate( 0 , i -> i <100 , i -> ++i).max().getAsInt();

        Assert.assertTrue( max == 99);
    }
}
