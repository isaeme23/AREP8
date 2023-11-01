package eci.edu.microservicios;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/v1/service/user")
public class UserController {

    @GET()
    @Path("all-valid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPosts() {
        return Response.ok("Es valido").build();
    }
}
