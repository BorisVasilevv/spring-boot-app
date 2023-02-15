package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class PostService {
    private List<Post> posts= Arrays.asList(
            new Post(0l,"Купил мужик шляпу", new Date(2023, 1,14,12,32,45)),
            new Post(1l,"А она ему...", new Date(2023, 1,14,12,56,45)),
            new Post(2l,"Как раз", new Date(2023, 1,14,13,32,45))
    );
    public List<Post> listAllPosts(){

        return posts;
    }

    public void create(String text) {
        Long count= posts.stream().count();
        posts.add(new Post(count,text, new Date()));
    }

}
