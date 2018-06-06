package com.se77.java9.examples;

import org.junit.jupiter.api.Test;

public class TryWithResourceTest {

    @Test
    public void testNonFinalCloseWithResource(){

        Resource resource = new Resource();

        // compiles altough resource is not final but effectivey final
        try (resource) {
        	// do something with your resource
        }

        // Java 8 style.
        try (Resource r2 = resource){
        	// do something with your resource
        }


    }
}
