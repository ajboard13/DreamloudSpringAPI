package com.dreamloud.dreamloudspringapi.repositories;

import com.dreamloud.dreamloudspringapi.domain.DreamInterests;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DreamInterestsRepository extends JpaRepository<DreamInterests, Long> {

    List<DreamInterests> findAllByDrmId(Long drmId);
}
