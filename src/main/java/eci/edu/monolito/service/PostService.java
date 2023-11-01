package eci.edu.monolito.service;

import eci.edu.monolito.model.Post;
import eci.edu.monolito.persistence.APIPersistence;

import java.util.HashMap;
import java.util.Optional;

public class PostService {

    private APIPersistence posts = new APIPersistence();

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