package com.dreamloud.dreamloudspringapi.controllers;

import com.dreamloud.dreamloudspringapi.domain.Post;
import com.dreamloud.dreamloudspringapi.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(PostController.BASE_URL)
public class PostController {
    public static final String BASE_URL = "api/v1/posts";

    private final PostService postService;


    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

}
