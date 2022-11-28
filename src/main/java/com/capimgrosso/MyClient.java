package com.capimgrosso;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api")
@RegisterRestClient(configKey = "myclient")
public interface MyClient {
    @GET
    @Path("/doit")
    String doIt();
}
