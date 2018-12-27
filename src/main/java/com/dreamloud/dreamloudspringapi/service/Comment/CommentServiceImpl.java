package com.dreamloud.dreamloudspringapi.service.Comment;

import com.dreamloud.dreamloudspringapi.domain.Comment;
import com.dreamloud.dreamloudspringapi.repositories.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> findAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public List<Comment> findAllByAcctId(Long acctId) {
        return commentRepository.findAllByAcctId(acctId);
    }

    @Override
    public List<Comment> findAllByPostId(Long postId) {
        return commentRepository.findAllByPostId(postId);
    }

    @Override
    public Comment findById(Long commentId) {
        Optional<Comment> comment = commentRepository.findById(commentId);
        return comment.orElse(null);
    }

    @Override
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }
}
