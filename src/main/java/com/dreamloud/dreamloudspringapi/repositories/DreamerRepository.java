package com.dreamloud.dreamloudspringapi.repositories;


import com.dreamloud.dreamloudspringapi.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DreamerRepository extends JpaRepository<Account, Long> {
}
