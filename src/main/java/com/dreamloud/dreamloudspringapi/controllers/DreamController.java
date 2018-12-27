package com.dreamloud.dreamloudspringapi.controllers;

import com.dreamloud.dreamloudspringapi.domain.Dream;
import com.dreamloud.dreamloudspringapi.service.DreamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(DreamController.BASE_URL)
public class DreamController {
    public static final String BASE_URL = "api/v1/dreams";

    private final DreamService dreamService;

    public DreamController(DreamService dreamService) {
        this.dreamService = dreamService;
    }

    @GetMapping
    List<Dream> findAllDreams(){
        return dreamService.findAllDreams();
    }

    @GetMapping("/{dreamId}")
    Dream findDreamById(@PathVariable Long dreamId) {
        return dreamService.findDreamById(dreamId);
    }

    @PostMapping
    Dream saveDream(@RequestBody Dream dream) {
        return dreamService.saveDream(dream);
    }
}
