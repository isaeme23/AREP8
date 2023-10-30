package eci.edu.persistence;

import eci.edu.entities.Post;
import eci.edu.entities.User;

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

    public Post addPost(String content){
        Post newPost = new Post(numberOfPosts, content);
        APIPosts.put(newPost.getId(), newPost);
        return newPost;
    }
}
