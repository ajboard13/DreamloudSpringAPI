package com.dreamloud.dreamloudspringapi.service.Dream;

import com.dreamloud.dreamloudspringapi.domain.Dream;
import com.dreamloud.dreamloudspringapi.repositories.DreamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DreamServiceImpl implements DreamService {

    private final DreamRepository dreamRepository;

    public DreamServiceImpl(DreamRepository dreamRepository) {
        this.dreamRepository = dreamRepository;
    }

    @Override
    public List<Dream> findAllDreams() {
        return dreamRepository.findAll();
    }

    @Override
    public Dream findDreamById(Long dreamId) {
        Optional<Dream> dream = dreamRepository.findById(dreamId);
        return dream.orElse(null);
    }

    @Override
    public Dream saveDream(Dream dream) {
        return dreamRepository.save(dream);
    }
}
