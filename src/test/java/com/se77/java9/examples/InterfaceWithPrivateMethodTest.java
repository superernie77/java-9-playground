package com.se77.java9.examples;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InterfaceWithPrivateMethodTest {

    @Test
    public void testInterfaceWithPrivateMethod(){
        InterfaceWithPrivateMethod greeter = new Greeter();

        assertTrue(greeter.getGreeting("Ernie").equals("Hello Ernie!"));
    }
}
