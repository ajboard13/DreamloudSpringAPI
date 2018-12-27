package com.dreamloud.dreamloudspringapi.repositories;

import com.dreamloud.dreamloudspringapi.domain.Interest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestRepository extends JpaRepository<Interest, Long> {
}
