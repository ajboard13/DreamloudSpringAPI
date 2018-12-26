package com.dreamloud.dreamloudspringapi.service;

import com.dreamloud.dreamloudspringapi.domain.Account;
import com.dreamloud.dreamloudspringapi.repositories.DreamerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DreamerServiceJpaImpl implements DreamerService {

    private  final DreamerRepository dreamerRepository;

    public DreamerServiceJpaImpl(DreamerRepository dreamerRepository){
        this.dreamerRepository = dreamerRepository;
    }
    @Override
    public Account findDreamerById(Long id) {
        return dreamerRepository.findById(id).get();
    }

    @Override
    public List<Account> findAllDreamers() {
        return dreamerRepository.findAll();
    }

    @Override
    public Account saveDreamer(@RequestBody Account dreamer) {
        return dreamerRepository.save(dreamer);
    }
}
