package com.se77.java9.examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethodsTest {

    @Test
    public void createSetByFactoryMethod(){
        Set<String> strings = Set.of("a","b","c");
        Assert.assertTrue(strings.size() == 3);
    }

    @Test
    public void createListByFactoryMethod(){
        List<String> strings = List.of("a","b","c");
        Assert.assertTrue(strings.size() == 3);
    }

    @Test
    public void createMapByFactoryMethod(){
        Map<String,String> strings = Map.of("key_a","value","key_b","value","key_c","value");
        Assert.assertTrue(strings.size() == 3);
    }

}
