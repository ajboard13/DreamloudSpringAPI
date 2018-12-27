package com.dreamloud.dreamloudspringapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dreammems")
public class DreamMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long drm_mem_id;

    private boolean drmmem_is_admin;

    @Column(name = "DRM_ID")
    private Long drmId;
    private Long acct_id;
}
