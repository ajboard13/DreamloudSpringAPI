package com.dreamloud.dreamloudspringapi.controllers;

import com.dreamloud.dreamloudspringapi.domain.Dreamers;
import com.dreamloud.dreamloudspringapi.service.DreamersService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(DreamersController.BASE_URL)
public class DreamersController {

    public static final String BASE_URL = "api/v1/dreamers";

    private final DreamersService dreamersService;

    public DreamersController(DreamersService dreamersService) {
        this.dreamersService = dreamersService;
    }

    @GetMapping("/{id}")
    public List<Dreamers> getAllDreamersById(@PathVariable Long id){
        return dreamersService.findAllDreamersById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Dreamers saveDreamers(@RequestBody Dreamers dreamers){
        return dreamersService.saveDreamers(dreamers);
    }
}
