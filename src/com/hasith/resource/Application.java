package com.hasith.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by hasith on 1/21/2016.
 */
@Path("/resource")
public class Application {

    /*
    initial get method for invoke
     */
    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello(){
        return "Hey Application... ";
    }

    /**
     * hasith
     * for saving data
     * @param data
     * @return
     */
    @POST
    @Path("/save/{data}")
    @Produces(MediaType.TEXT_PLAIN)
    public String saveData(@PathParam("data") String data){
        return  "Data is Saved "+ data;
    }
}
