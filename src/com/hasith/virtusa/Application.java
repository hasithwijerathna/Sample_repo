package com.hasith.virtusa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by hasith on 1/21/2016.
 */
@Path("/resource")
public class Application {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(){
        return "Hey Application... ";
    }
}
