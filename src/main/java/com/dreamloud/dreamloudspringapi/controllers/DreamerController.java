package com.dreamloud.dreamloudspringapi.controllers;

import com.dreamloud.dreamloudspringapi.domain.Account;
import com.dreamloud.dreamloudspringapi.service.DreamerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(DreamerController.BASE_URL)
public class DreamerController {

    public static final String BASE_URL = "/api/v1/dreamers";

    private final DreamerService dreamerService;

    public DreamerController(DreamerService dreamerService) {
        this.dreamerService = dreamerService;
    }

    @GetMapping
    List<Account> getAllDreamers() {
        return  dreamerService.findAllDreamers();
    }

    @GetMapping("/{id}")
    public Account getDreamerById(@PathVariable Long id){
        return dreamerService.findDreamerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account saveDreamer (Account dreamer){
        return dreamerService.saveDreamer(dreamer);
    }
}
