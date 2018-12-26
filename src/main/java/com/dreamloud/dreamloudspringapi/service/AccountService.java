package com.dreamloud.dreamloudspringapi.service;

import com.dreamloud.dreamloudspringapi.domain.Account;

import java.util.List;

public interface AccountService {
    Account findAccountById(Long id);
    List<Account> findAllAccounts();

    Account saveAccount(Account dreamer);
}
