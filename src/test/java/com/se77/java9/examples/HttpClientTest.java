package com.se77.java9.examples;

import org.junit.Assert;
import org.junit.Test;

import java.net.URI;

public class HttpClientTest {

    // ATTENTION!!! To run this test you need to add the HttpClient mudule to the JVM on startup.
    // This is what needs to be added to the java command
    @Test
    public void getGooglePage() throws Exception {
        HttpClientWrapper myWrapper = new HttpClientWrapper();

        String result = myWrapper.getContent("http://www.google.de");

        Assert.assertTrue(result != null);
    }
}
