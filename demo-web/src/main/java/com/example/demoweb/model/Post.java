package com.example.demoweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;

    private Date creationDate;
    private int likes;


    public Post(Long id,String text,Date creationDate)
    {
        this.id=id;
        this.text=text;
        this.likes=0;
        this.creationDate= creationDate;
    }

    public Post(){}

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
