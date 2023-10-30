package eci.edu.entities;

public class Post {

    private String id;
    private String content;

    public Post(Integer id, String content) {
        this.id = String.valueOf("P"+id);
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
