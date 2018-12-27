package com.dreamloud.dreamloudspringapi.service.Interest;

import com.dreamloud.dreamloudspringapi.domain.Interest;
import com.dreamloud.dreamloudspringapi.repositories.InterestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InterestServiceImpl implements InterestService {

    private final InterestRepository interestRepository;

    public InterestServiceImpl(InterestRepository interestRepository) {
        this.interestRepository = interestRepository;
    }

    @Override
    public List<Interest> findAllInterests() {
        return interestRepository.findAll();
    }

    @Override
    public Interest findById(Long intrId) {
        Optional<Interest> interest = interestRepository.findById(intrId);
        return interest.orElse(null);
    }

    @Override
    public Interest saveInterest(Interest interest) {
        return interestRepository.save(interest);
    }

    @Override
    public void deleteInterest(Interest interest) {
        interestRepository.delete(interest);
    }
}
