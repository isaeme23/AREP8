package eci.edu;


import java.io.IOException;
import java.nio.file.Files;
import java.security.Principal;
import java.util.HashMap;
import java.util.Optional;

import eci.edu.entities.Post;
import eci.edu.service.PostService;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;
@Path("/twitter")
public class APIController {

    private PostService postService = new PostService();
    @GET()
    @Path("all-posts")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPosts() {
        return Response.ok(postService.getAllPosts()).build();
    }

    @GET()
    @Path("/")
    @Produces(MediaType.TEXT_HTML)
    public Response getIndex() throws IOException {
        return Response.ok(Files.readAllBytes(java.nio.file.Path.of("./src/main/resources/public/index.html"))).build();
    }

    @POST()
    @Path("addPost")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPost(String content) {
        Optional<Post> post = postService.addPost(content.split(":")[1]);
        return Response.ok(post).build();
    }
}
