package com.dreamloud.dreamloudspringapi.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "Dream_Posts")
public class Post {

    @Id
    @Column(name = "Dream_postId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dream_postId;

    @Column(name = "DRM_ID")
    private Long dreamId;

    @Column(name = "ACCT_ID")
    private Long acctId;

    private String post_title;
    private String post_content;
    private Timestamp time_posted;
}
