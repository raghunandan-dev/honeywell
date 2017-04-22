package org.movies.resource;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Path("/healthcheck")
@Component
@Produces({MediaType.TEXT_PLAIN})
public class HealthCheckResource {

    @PermitAll
    @GET
    public Response ping() {
        return Response.ok().entity("Running ... What more!!!").build();
    }

}
