package com.dreamloud.dreamloudspringapi.service.Account;

import com.dreamloud.dreamloudspringapi.domain.Account;
import com.dreamloud.dreamloudspringapi.repositories.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceJpaImpl implements AccountService {

    private  final AccountRepository accountRepository;

    public AccountServiceJpaImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    @Override
    public Account findAccountById(Long id) {
        Optional<Account> account = accountRepository.findById(id);
        return account.orElse(null);
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
