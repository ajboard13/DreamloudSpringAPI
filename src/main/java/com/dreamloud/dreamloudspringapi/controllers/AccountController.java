package com.dreamloud.dreamloudspringapi.controllers;

import com.dreamloud.dreamloudspringapi.domain.Account;
import com.dreamloud.dreamloudspringapi.service.Account.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AccountController.BASE_URL)
public class AccountController {

    public static final String BASE_URL = "/api/v1/accounts";

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    List<Account> getAllAccounts() {
        return  accountService.findAllAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id){
        return accountService.findAccountById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account saveAccount (@RequestBody Account account){
        return accountService.saveAccount(account);
    }
}
