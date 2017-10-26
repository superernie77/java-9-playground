package com.se77.java9.examples;

/**
 * Interfaces can have private methods which are called
 */
public interface InterfaceWithPrivateMethod {

    default String getGreeting(String name){
        return getGreetingText() + name +"!";
    }

    private String getGreetingText(){
        return "Hello ";
    }
}
