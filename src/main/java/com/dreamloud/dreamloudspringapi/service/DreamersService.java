package com.dreamloud.dreamloudspringapi.service;

import com.dreamloud.dreamloudspringapi.domain.Dreamers;

import java.util.List;

public interface DreamersService {

    Dreamers saveDreamers(Dreamers dreamers);
    List<Dreamers> findAllDreamersById(Long id);

}
