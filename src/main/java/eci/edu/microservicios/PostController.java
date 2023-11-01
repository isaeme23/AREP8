package eci.edu.microservicios;

import eci.edu.model.Post;
import eci.edu.service.PostService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Optional;

@Path("/v1/service/post")
public class PostController {
    @Inject
    PostService postService;

    @POST()
    @Path("addPost")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPost(String content) {
        Optional<Post> post = postService.addPost(content.split(",")[1], content.split(",")[0]);
        return Response.ok(post).build();
    }
}
