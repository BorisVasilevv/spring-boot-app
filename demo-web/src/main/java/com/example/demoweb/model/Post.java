package com.example.demoweb.model;

import java.util.Date;

public class Post {

    public Post(String text,Date creationDate)
    {
        this.text=text;
        this.likes=0;
        this.creationDate= creationDate;
    }

    private String text;

    private Date creationDate;
    private Integer likes;

    public String getText() {
        return this.text;
    }
    public Date getCreationDate() { return  this.creationDate;}
    public Integer getLikes() {
        return likes;
    }
}
