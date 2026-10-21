package com.pedrocaput.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Produces(MediaType.APPLICATION_JSON)
@Path("starwars")
public class StarWarsResource {
    @RestClient
    StarWarsService starWarsService;

    @GET
    @Path("starships")
    public String getStarships(){
        return starWarsService.getStarships();
    }
}
