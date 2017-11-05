package com.se77.java9.examples;

public class Resource implements AutoCloseable {

    @Override
    public void close() {
        System.out.print("Closing Resource");
    }
}
