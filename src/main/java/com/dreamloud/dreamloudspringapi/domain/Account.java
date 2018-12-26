package com.dreamloud.dreamloudspringapi.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long acct_id;
    private String acct_fname;
    private String acct_lname;
    private String acct_email;
    private String acct_username;
    private String acct_pw;
    private String acct_mi;
    private String acct_dob;
    private Long acct_zip;
    private String acct_cntry;
    private String acct_pic;
    private String acct_bio;
    private byte acct_online;
    private byte acct_flgn;
}
