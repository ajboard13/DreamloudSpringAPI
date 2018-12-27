package com.dreamloud.dreamloudspringapi.service;

import com.dreamloud.dreamloudspringapi.domain.Post;
import com.dreamloud.dreamloudspringapi.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public List<Post> getAllPostsByDreamId(Long dreamId) {
        return postRepository.getAllByDreamId(dreamId);
    }

    @Override
    public Post getPostById(Long postId) {
        Optional<Post> post = postRepository.findById(postId);
        return post.orElse(null);
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPostsByAcctId(Long acctId) {
        return postRepository.getAllByAcctId(acctId);
    }
}
