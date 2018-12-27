package com.dreamloud.dreamloudspringapi.controllers;

import com.dreamloud.dreamloudspringapi.domain.Post;
import com.dreamloud.dreamloudspringapi.service.PostService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{postId}")
    Post getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }

    @GetMapping("/acct/{acctId}")
    List<Post> getPostsByAcctId(@PathVariable Long acctId) {
        return postService.getAllPostsByAcctId(acctId);
    }

    @GetMapping("/dream/{dreamId}")
    List<Post> getPostsByDreamId(@PathVariable Long dreamId) {
        return postService.getAllPostsByDreamId(dreamId);
    }

    @PostMapping
    Post savePost(@RequestBody Post post) {
        return postService.savePost(post);
    }
}
