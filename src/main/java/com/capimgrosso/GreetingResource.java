package com.capimgrosso;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
    @RestClient
    MyClient client;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return client.doIt();
    }
}