package com.dreamloud.dreamloudspringapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dreaminterests")
public class DreamInterests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long drmIntrId;

    private Long drmId;
    private Long intrId;
}
