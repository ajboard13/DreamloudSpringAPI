package com.dreamloud.dreamloudspringapi.service;

import com.dreamloud.dreamloudspringapi.domain.Account;
import com.dreamloud.dreamloudspringapi.repositories.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AccountServiceJpaImpl implements AccountService {

    private  final AccountRepository accountRepository;

    public AccountServiceJpaImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    @Override
    public Account findAccountById(Long id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public List<Account> findAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account saveAccount(@RequestBody Account dreamer) {
        return accountRepository.save(dreamer);
    }
}
