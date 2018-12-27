package com.dreamloud.dreamloudspringapi.service.Interest;

import com.dreamloud.dreamloudspringapi.domain.Interest;

import java.util.List;

public interface InterestService {
    List<Interest> findAllInterests();

    Interest findById(Long intrId);

    Interest saveInterest(Interest interest);

    void deleteInterest(Interest interest);
}
