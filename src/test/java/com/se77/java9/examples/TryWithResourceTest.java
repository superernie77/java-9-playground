package com.se77.java9.examples;

import org.junit.Test;

public class TryWithResourceTest {

    @Test
    public void testNonFinalCloseWithResource(){

        Resource resource = new Resource();

        // compiles altough resource is not final but effectivey final
        try (resource) {

        }

        // Java 8 style
        try (Resource r2 = resource){

        }


    }
}
