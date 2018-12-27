package com.dreamloud.dreamloudspringapi.repositories;

import com.dreamloud.dreamloudspringapi.domain.DreamMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DreamMemberRepository extends JpaRepository<DreamMember, Long> {

    List<DreamMember> findAllByDrmId(Long drmId);

}
