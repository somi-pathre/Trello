package com.trello.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/cards")
public class CardAPI {

    @GET
    public Response getCards() {

        String output = "Jersey say : hello";

        return Response.status(200).entity(output).build();

    }

}
