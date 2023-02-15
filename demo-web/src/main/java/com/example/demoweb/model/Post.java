package com.example.demoweb.model;

import java.util.Date;

public class Post {

    public Post(Long id,String text,Date creationDate)
    {
        this.id=id;
        this.text=text;
        this.likes=0;
        this.creationDate= creationDate;
    }

    private Long id;
    private String text;

    private Date creationDate;
    private Integer likes;

    public String getText() {
        return text;
    }
    public Date getCreationDate() { return creationDate;}
    public Integer getLikes() {
        return likes;
    }
    public Long getId(){return id;}
    public void setLikes(int likes){this.likes=likes;}
}
