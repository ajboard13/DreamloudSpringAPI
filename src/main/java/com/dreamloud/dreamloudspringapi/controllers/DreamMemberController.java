package com.dreamloud.dreamloudspringapi.controllers;

import com.dreamloud.dreamloudspringapi.domain.DreamMember;
import com.dreamloud.dreamloudspringapi.service.Dream.DreamMemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(DreamMemberController.BASE_URL)
public class DreamMemberController {
    public static final String BASE_URL = "api/v1/dreammems";

    private final DreamMemberService dreamMemberService;

    public DreamMemberController(DreamMemberService dreamMemberService) {
        this.dreamMemberService = dreamMemberService;
    }

    @GetMapping
    List<DreamMember> getAllDreamMembers() {
        return dreamMemberService.findAllDreamMembers();
    }

    @GetMapping("/{dreamId}")
    List<DreamMember> getAllByDreamId(@PathVariable Long dreamId) {
        return dreamMemberService.findAllByDreamId(dreamId);
    }

    @PostMapping
    DreamMember saveDreamMember(@RequestBody DreamMember dreamMember) {
        return dreamMemberService.saveDreamMember(dreamMember);
    }

    @DeleteMapping
    void deleteDreamMember(@RequestBody DreamMember dreamMember) {
        dreamMemberService.deleteDreamMember(dreamMember);

    }

}
