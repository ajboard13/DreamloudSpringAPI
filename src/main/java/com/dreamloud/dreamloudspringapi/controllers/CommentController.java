package com.dreamloud.dreamloudspringapi.controllers;

import com.dreamloud.dreamloudspringapi.domain.Comment;
import com.dreamloud.dreamloudspringapi.service.Comment.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CommentController.BASE_URL)
public class CommentController {
    public static final String BASE_URL = "/api/v1/comments";

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    List<Comment> getAllComments(){
        return commentService.findAllComments();
    }

    @GetMapping("/{commentId}")
    Comment findById(@PathVariable Long commentId) {
        return commentService.findById(commentId);
    }

    @GetMapping("/acct/{acctId}")
    List<Comment> findAllByAcctId(@PathVariable Long acctId) {
        return commentService.findAllByAcctId(acctId);
    }

    @GetMapping("/post/{postId}")
    List<Comment> findAllByPostId(@PathVariable Long postId) {
        return commentService.findAllByPostId(postId);
    }

    @PostMapping
    Comment saveComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }
}
