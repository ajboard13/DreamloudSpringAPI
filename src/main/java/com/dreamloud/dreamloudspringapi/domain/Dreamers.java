package com.dreamloud.dreamloudspringapi.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Dreamers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long acct_acct_id;


    private Long acct;

    private Long acct_id_2;
    private Timestamp drmr_req_datetime = new Timestamp(System.currentTimeMillis());
}
