package com.dreamloud.dreamloudspringapi.controllers;

import com.dreamloud.dreamloudspringapi.domain.Interest;
import com.dreamloud.dreamloudspringapi.service.Interest.InterestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(InterestController.BASE_URL)
public class InterestController {
    public static final String BASE_URL = "api/v1/interests";
    private final InterestService interestService;

    public InterestController(InterestService interestService) {
        this.interestService = interestService;

    }

    @GetMapping
    List<Interest> getAllInterests() {
        return interestService.findAllInterests();
    }

    @GetMapping("/{intrId}")
    Interest getInterestById(@PathVariable Long intrId) {
        return interestService.findById(intrId);
    }

    @PostMapping
    Interest saveInterest(@RequestBody Interest interest) {
        return interestService.saveInterest(interest);
    }

    @DeleteMapping
    void deleteInterest(@RequestBody Interest interest) {
        interestService.deleteInterest(interest);
    }
}
