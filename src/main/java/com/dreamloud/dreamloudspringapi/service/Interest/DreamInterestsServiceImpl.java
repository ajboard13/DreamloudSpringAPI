package com.dreamloud.dreamloudspringapi.service.Interest;

import com.dreamloud.dreamloudspringapi.domain.DreamInterests;
import com.dreamloud.dreamloudspringapi.repositories.DreamInterestsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DreamInterestsServiceImpl implements DreamInterestsService {
    private final DreamInterestsRepository dreamInterestsRepository;

    public DreamInterestsServiceImpl(DreamInterestsRepository dreamInterestsRepository) {
        this.dreamInterestsRepository = dreamInterestsRepository;
    }

    @Override
    public List<DreamInterests> findAllByDreamId(Long dreamId) {
        return dreamInterestsRepository.findAllByDrmId(dreamId);
    }

    @Override
    public List<DreamInterests> findAllDreamInterests() {
        return dreamInterestsRepository.findAll();
    }

    @Override
    public DreamInterests findDreamInterestById(Long dreamIntrId) {
        Optional<DreamInterests> dreamInterests = dreamInterestsRepository.findById(dreamIntrId);
        return dreamInterests.orElse(null);
    }

    @Override
    public DreamInterests saveDreamInterests(DreamInterests dreamInterests) {
        return dreamInterestsRepository.save(dreamInterests);
    }

    @Override
    public void deleteDreamInterests(DreamInterests dreamInterests) {
        dreamInterestsRepository.delete(dreamInterests);
    }
}
