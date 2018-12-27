package com.dreamloud.dreamloudspringapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dreams")
public class Dream {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long drm_id;

    private String drm_name;
    private String drm_bio;
}
