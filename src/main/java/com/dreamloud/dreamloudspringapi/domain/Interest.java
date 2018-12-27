package com.dreamloud.dreamloudspringapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "interests")
public class Interest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long intrId;
    private String intrName;
}
