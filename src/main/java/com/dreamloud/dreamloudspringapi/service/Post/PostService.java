package com.dreamloud.dreamloudspringapi.service.Post;

import com.dreamloud.dreamloudspringapi.domain.Post;

import java.util.List;

public interface PostService {

    List<Post> getAllPosts();
    List<Post> getAllPostsByDreamId(Long dreamId);
    Post getPostById(Long postId);
    Post savePost(Post post);

    List<Post> getAllPostsByAcctId(Long acctId);
}
