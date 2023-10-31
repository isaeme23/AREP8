package eci.edu.service;

import eci.edu.entities.Post;
import eci.edu.persistence.APIPersistence;

import java.util.HashMap;
import java.util.Optional;

public class PostService {

    private APIPersistence posts = new APIPersistence();

    public HashMap<String, String> getAllPosts(){
        return posts.getAPIPosts();
    }

    public Optional<Post> addPost(String content){
        if (content.length() < 140){
            return Optional.of(posts.addPost(content));
        }
        return Optional.empty();
    }
}
