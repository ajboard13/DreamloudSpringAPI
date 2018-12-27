package com.dreamloud.dreamloudspringapi.repositories;

import com.dreamloud.dreamloudspringapi.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> getAllByDreamId(Long dreamId);

    List<Post> getAllByAcctId(Long acctId);
}
