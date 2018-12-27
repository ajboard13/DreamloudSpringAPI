package com.dreamloud.dreamloudspringapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "meminterests")
public class MemberInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long intrAcctId;

    private Long intrId;
    private Long acctId;
}
