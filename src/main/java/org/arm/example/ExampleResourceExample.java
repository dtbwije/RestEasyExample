package org.arm.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by tharanga on 3/21/16.
 */
@Path("/activities")
public class ExampleResourceExample {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getAll() {
        return "Hello World";
    }
}
