package org.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")

public class HelloResource {

    @GET
    @Path("/v1")
    @Produces(MediaType.APPLICATION_JSON)
    public String SayHello(){
        return "{\"Msg do Gato Javo\":\"Odeio Javo!\"}";
    }

    @GET
    @Path("/v2")
    @Produces(MediaType.APPLICATION_JSON)
    public String SayHello2(){
        return """
                {"Mensagem":"Hello, World!"}
                """;
    }
}

