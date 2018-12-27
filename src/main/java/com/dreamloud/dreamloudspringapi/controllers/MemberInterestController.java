package com.dreamloud.dreamloudspringapi.controllers;

import com.dreamloud.dreamloudspringapi.domain.MemberInterest;
import com.dreamloud.dreamloudspringapi.service.Interest.MemberInterestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(MemberInterestController.BASE_URL)
public class MemberInterestController  {

    public static final String BASE_URL = "api/v1/meminterests";

    private final MemberInterestService memberInterestService;

    public MemberInterestController(MemberInterestService memberInterestService) {
        this.memberInterestService = memberInterestService;
    }

    @GetMapping
    List<MemberInterest> getAllMemberInterests() {
        return memberInterestService.findAll();
    }

    @GetMapping("/acct/{acctId}")
    List<MemberInterest> getAllbyAcctId(@PathVariable Long acctId) {
        return memberInterestService.findAllByAcctId(acctId);
    }

    @GetMapping("/{intrAcctId}")
    MemberInterest findById(@PathVariable Long intrAcctId) {
        return memberInterestService.findById(intrAcctId);
    }

    @PostMapping
    MemberInterest saveMemberInterest(@RequestBody MemberInterest memberInterest) {
        return memberInterestService.saveMemberInterest(memberInterest);
    }

    @DeleteMapping
    void deleteMemberInterest(@RequestBody MemberInterest memberInterest) {
        memberInterestService.deleteMemberInterest(memberInterest);
    }
}
