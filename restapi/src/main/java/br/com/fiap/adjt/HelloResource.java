package br.com.fiap.adjt;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/demo")
public class HelloResource {

    @GET
    @Path("/v1")
    public String sayHello(){
        return "{\"mensagem\":\"Hello, World!\"}";
    }

    @GET
    @Path("/v1/teste")
    public String sayHelloV1Teste(){
        return "{\"mensagem\":\"Hello, World!\"}";
    }

    @GET
    @Path("/v2")
    public String sayHelloVersao2(){
        return """
                {"mensagem":"Hello, World!"}
                """;
    }

    @GET
    @Path("/pessoas")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPessoa(){
        return Response.status(Response.Status.OK).entity(FakeDb.pessoas).build();
    }

    @POST
    @Path("/pessoa")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPessoa(Pessoa pessoa){
        if(pessoa.getId() != null){
            FakeDb.pessoas.put(pessoa.getId(),pessoa);
            return Response.status(Response.Status.CREATED).entity(pessoa).build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(Map.of("mensagem","id inválido")).build();
        }
    }

    @PUT
    @Path("/pessoa/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePessoa(@PathParam("id") Long id,Pessoa pessoa){
        if(FakeDb.pessoas.containsKey(id)){
            FakeDb.pessoas.replace(id,pessoa);
            return Response.status(Response.Status.OK).entity(pessoa).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(Map.of("mensagem","id não existe")).build();
        }

    }

    @DELETE
    @Path("/pessoa/{id}")
    public Response deletePessoa(@PathParam("id") Long id){
        if(FakeDb.pessoas.containsKey(id)){
            FakeDb.pessoas.remove(id);
        }
        return Response.status(Response.Status.OK).build();
    }

}
