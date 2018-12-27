package com.dreamloud.dreamloudspringapi.service;

import com.dreamloud.dreamloudspringapi.domain.Post;

import java.util.List;

public interface PostService {

    List<Post> getAllPosts();
    List<Post> getAllPostsByDreamId(Long dreamId);
    Post getPostById(Long postId);
    Post savePost(Post post);

}
