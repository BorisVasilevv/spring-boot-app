package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        Post p1=new Post("Купил мужик шляпу", new Date(2023, 02,14));
        Post p2 =new Post("А она ему...", new Date(2023, 02,14));
        Random random=new Random();
        String result = random.nextInt()%2==0
                ? "Как раз"
                : "Не подошла";
        Post p3= new Post(result, new Date(2023, 02,14));
        return Arrays.asList(p1,p2,p3);
    }


}
