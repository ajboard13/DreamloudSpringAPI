package com.dreamloud.dreamloudspringapi.controllers;

import com.dreamloud.dreamloudspringapi.domain.DreamInterests;
import com.dreamloud.dreamloudspringapi.service.Interest.DreamInterestsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(DreamInterestsController.BASE_URL)
public class DreamInterestsController {
    public static final String BASE_URL = "api/v1/dreaminterests";

    private final DreamInterestsService dreamInterestsService;

    public DreamInterestsController(DreamInterestsService dreamInterestsService) {
        this.dreamInterestsService = dreamInterestsService;
    }

    @GetMapping
    List<DreamInterests> getAllDreamInterests() {
        return dreamInterestsService.findAllDreamInterests();
    }

    @GetMapping("dream/{dreamId}")
    List<DreamInterests> getDreamInterestsByDreamId(@PathVariable Long dreamId) {
        return dreamInterestsService.findAllByDreamId(dreamId);
    }

    @GetMapping("/{dreamIntrId}")
    DreamInterests getById(@PathVariable Long dreamIntrId) {
        return dreamInterestsService.findDreamInterestById(dreamIntrId);
    }

    @PostMapping
    DreamInterests saveDreamInterest(@RequestBody DreamInterests dreamInterests) {
        return dreamInterestsService.saveDreamInterests(dreamInterests);
    }

    @DeleteMapping
    void deleteDreamInterest(@RequestBody DreamInterests dreamInterests) {
        dreamInterestsService.deleteDreamInterests(dreamInterests);
    }
}
