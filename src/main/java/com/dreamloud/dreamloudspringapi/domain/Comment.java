package com.dreamloud.dreamloudspringapi.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "post_comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private Long postId;
    private String comment_content;
    private Long acctId;
    private Timestamp date;

}
