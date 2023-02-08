package com.example.demoweb.model;

public class Post {

    public Post(String text)
    {
        this.text=text;
        this.likes=0;
    }

    private String text;

    private Integer likes;

    public String getText() {
        return this.text;
    }

    public Integer getLikes() {
        return likes;
    }
}
