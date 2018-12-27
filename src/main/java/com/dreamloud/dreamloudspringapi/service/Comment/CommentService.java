package com.dreamloud.dreamloudspringapi.service.Comment;

import com.dreamloud.dreamloudspringapi.domain.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> findAllComments();

    List<Comment> findAllByAcctId(Long acctId);

    List<Comment> findAllByPostId(Long postId);

    Comment findById(Long commentId);

    Comment saveComment(Comment comment);

}
