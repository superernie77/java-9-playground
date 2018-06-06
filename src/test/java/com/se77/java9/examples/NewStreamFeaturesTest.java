package com.se77.java9.examples;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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
        assertTrue( max == 99);
    }

    /**
     * Limit the stream with a while construct
     */
    @Test
    public void testTakeWhile(){
        List<String> results = Stream.of("a", "b", "c", "test", "d").takeWhile(s -> !s.equals("test")).collect(Collectors.toList());
        assertEquals(results.get(2) , "c");
    }

    /**
     * Skipping elements with a while construct
     */
    @Test
    public void testDropWhile(){
        List<String> results = Stream.of("a", "b", "c", "test", "d").dropWhile(s -> !s.equals("test")).collect(Collectors.toList());
        assertEquals(results.get(1) , "d");
    }

    /**
     * Create stream from a null value
     */
    @Test
    public void testOfNullable(){
        long result = Stream.ofNullable(null).count();
        assertEquals(result , 0);
    }
}


