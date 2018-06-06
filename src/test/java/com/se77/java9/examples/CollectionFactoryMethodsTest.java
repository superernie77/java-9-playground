package com.se77.java9.examples;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethodsTest {

    @Test
    public void createSetByFactoryMethod(){
        Set<String> strings = Set.of("a","b","c");
        assertTrue(strings.size() == 3);
    }

    @Test
    public void createListByFactoryMethod(){
        List<String> strings = List.of("a","b","c");
        assertTrue(strings.size() == 3);
    }

    @Test
    public void createMapByFactoryMethod(){
        Map<String,String> strings = Map.of("key_a","value","key_b","value","key_c","value");
        assertTrue(strings.size() == 3);
    }

}
