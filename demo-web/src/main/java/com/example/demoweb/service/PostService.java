package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class PostService {
    private ArrayList<Post> posts= new ArrayList<>(
            Arrays.asList(new Post("Купил мужик шляпу", new Date(2023, 1,14,12,32,45)),
                    new Post("А она ему...", new Date(2023, 1,14,12,56,45)),
                            new Post("Как раз", new Date(2023, 1,14,13,32,45))
    ));
    public ArrayList<Post> listAllPosts(){

        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }

}
