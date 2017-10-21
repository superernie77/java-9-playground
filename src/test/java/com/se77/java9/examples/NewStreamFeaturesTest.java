package com.se77.java9.examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewStreamFeaturesTest {

    /**
     * Shows the new Primitive-Stream iterator, which mimics the old school for-loop
     */
    @Test
    public void testIterate(){
        int max = IntStream.iterate( 0 , i -> i <100 , i -> ++i).max().getAsInt();
        Assert.assertTrue( max == 99);
    }

    @Test
    public void testTakeWhile(){
        List<String> results = Stream.of("a", "b", "c", "test", "d").takeWhile(s -> !s.equals("test")).collect(Collectors.toList());
        Assert.assertEquals(results.get(2) , "c");
    }

    @Test
    public void testDropWhile(){
        List<String> results = Stream.of("a", "b", "c", "test", "d").dropWhile(s -> !s.equals("test")).collect(Collectors.toList());
        Assert.assertEquals(results.get(1) , "d");
    }

    @Test
    public void testOfNullable(){
        long result = Stream.ofNullable(null).count();
        Assert.assertEquals(result , 0);
    }
}


