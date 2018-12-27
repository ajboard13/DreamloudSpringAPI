package com.dreamloud.dreamloudspringapi.service.Interest;

import com.dreamloud.dreamloudspringapi.domain.MemberInterest;

import java.util.List;

public interface MemberInterestService {
    List<MemberInterest> findAll();

    List<MemberInterest> findAllByAcctId(Long acctId);

    MemberInterest findById(Long acctIntrId);

    MemberInterest saveMemberInterest(MemberInterest memberInterest);

    void deleteMemberInterest(MemberInterest memberInterest);
}
