package com.dreamloud.dreamloudspringapi.repositories;

import com.dreamloud.dreamloudspringapi.domain.Dreamers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DreamersRepository extends JpaRepository<Dreamers, Long> {

    List<Dreamers> findByAcct(Long acct);
}
