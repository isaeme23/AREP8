package eci.edu.service;

import eci.edu.model.Post;
import eci.edu.persistence.APIPersistence;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.HashMap;
import java.util.Optional;

@ApplicationScoped
public class PostService {

    @Inject
    APIPersistence posts;

    public HashMap<String, Post> getAllPosts(){
        return posts.getAPIPosts();
    }

    public Optional<Post> addPost(String content, String username){
        if (content.length() < 140){
            return Optional.of(posts.addPost(content, username));
        }
        return Optional.empty();
    }
}