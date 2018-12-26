package com.dreamloud.dreamloudspringapi.service;

import com.dreamloud.dreamloudspringapi.domain.Account;

import java.util.List;

public interface DreamerService {
    Account findDreamerById(Long id);
    List<Account> findAllDreamers();

    Account saveDreamer(Account dreamer);
}
