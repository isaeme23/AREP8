package eci.edu.monolito.persistence;

import eci.edu.monolito.model.Post;

import java.util.HashMap;
import java.util.Optional;

public class APIPersistence {

    private HashMap<String, Post> APIPosts = new HashMap<>();
    private int numberOfPosts = 1;

    public HashMap<String, Post> getAPIPosts() {
        return APIPosts;
    }

    public Optional<Post> getPost(String id){
        return Optional.of(APIPosts.getOrDefault(id, null));
    }

    public Post addPost(String content, String username){
        Post newPost = new Post(numberOfPosts, content, username);
        numberOfPosts++;
        APIPosts.put(newPost.getId(), newPost);
        return newPost;
    }
}