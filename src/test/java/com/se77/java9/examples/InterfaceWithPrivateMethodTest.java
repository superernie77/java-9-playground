package com.se77.java9.examples;

import org.junit.Assert;
import org.junit.Test;

public class InterfaceWithPrivateMethodTest {

    @Test
    public void testInterfaceWithPrivateMethod(){
        InterfaceWithPrivateMethod greeter = new Greeter();

        Assert.assertTrue(greeter.getGreeting("Ernie").equals("Hello Ernie!"));
    }
}
