package com.pedrocaput;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDateTime;

@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
@Path("/unipds")
public class UniPDSResource {
    private int i = 0;

    @GET
    public int getI(){
        return i;
    }

    @GET
    @Path("/getIDifferent")
    public int getIDifferent(){
        return LocalDateTime.now().getNano();
    }

    @POST
    public void addI(){
        i++;
    }

    @DELETE
    public void removeI(){
        i--;
    }

    @PUT
    public void setI(int i){
        this.i = i;
    }
}
