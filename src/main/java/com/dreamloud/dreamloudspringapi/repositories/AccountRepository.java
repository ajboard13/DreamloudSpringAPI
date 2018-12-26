package com.dreamloud.dreamloudspringapi.repositories;


import com.dreamloud.dreamloudspringapi.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
