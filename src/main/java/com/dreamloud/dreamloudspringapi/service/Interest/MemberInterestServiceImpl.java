package com.dreamloud.dreamloudspringapi.service.Interest;

import com.dreamloud.dreamloudspringapi.domain.MemberInterest;
import com.dreamloud.dreamloudspringapi.repositories.MemberInterestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberInterestServiceImpl implements MemberInterestService {

    private final MemberInterestRepository memberInterestRepository;

    public MemberInterestServiceImpl(MemberInterestRepository memberInterestRepository) {
        this.memberInterestRepository = memberInterestRepository;
    }

    @Override
    public List<MemberInterest> findAll() {
        return memberInterestRepository.findAll();
    }

    @Override
    public List<MemberInterest> findAllByAcctId(Long acctId) {
        return memberInterestRepository.findAllByAcctId(acctId);
    }

    @Override
    public MemberInterest findById(Long acctIntrId) {
        Optional<MemberInterest> memberInterest = memberInterestRepository.findById(acctIntrId);
        return memberInterest.orElse(null);
    }

    @Override
    public MemberInterest saveMemberInterest(MemberInterest memberInterest) {
        return memberInterestRepository.save(memberInterest);
    }

    @Override
    public void deleteMemberInterest(MemberInterest memberInterest) {
        memberInterestRepository.delete(memberInterest);
    }
}
