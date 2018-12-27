package com.dreamloud.dreamloudspringapi.service.Dreamer;

import com.dreamloud.dreamloudspringapi.domain.Dreamers;
import com.dreamloud.dreamloudspringapi.repositories.DreamersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DreamersServiceImpl implements DreamersService {

    private final DreamersRepository dreamersRepository;

    public DreamersServiceImpl(DreamersRepository dreamersRepository) {
        this.dreamersRepository = dreamersRepository;
    }

    @Override
    public Dreamers saveDreamers(Dreamers dreamers) {
        return dreamersRepository.save(dreamers);
    }

    @Override
    public List<Dreamers> findAllDreamersById(Long id) {
        return dreamersRepository.findByAcct(id);
    }
}
