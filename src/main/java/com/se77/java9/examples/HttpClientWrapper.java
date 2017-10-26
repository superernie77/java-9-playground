package com.se77.java9.examples;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;

public class HttpClientWrapper {

    // ATTENTION!!! To use this class you need to add the HttpClient mudule to the JVM on startup.
    // This is what needs to be added to the java command: -add-modules jdk.incubator.httpclient
    public String getContent(String uri) throws Exception{
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest req =
                HttpRequest.newBuilder(URI.create("http://www.google.com"))
                        .header("User-Agent","Java")
                        .GET()
                        .build();

        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandler.asString());

        return resp.body();
    }
}
