package com.se77.java9.examples;

import org.junit.Test;


public class DefaultLoggerTest {

    @Test
    public void useLogger(){

        System.Logger LOG = System.getLogger("com.se77.demologger");

        // by default INFO log-level is used
        boolean debugEnabled = LOG.isLoggable(System.Logger.Level.DEBUG);
        LOG.log(System.Logger.Level.INFO, "Debug enabled: "+debugEnabled);

        // this prints nothing
        LOG.log(System.Logger.Level.DEBUG,"my debug log message");

        LOG.log(System.Logger.Level.ERROR,"my error log message");

        LOG.log(System.Logger.Level.INFO,"my info log message");

    }
}


