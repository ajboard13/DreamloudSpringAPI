package com.dreamloud.dreamloudspringapi.service;

import com.dreamloud.dreamloudspringapi.domain.Dream;

import java.util.List;

public interface DreamService {

    List<Dream> findAllDreams();
    Dream findDreamById(Long dreamId);

    Dream saveDream(Dream dream);

}
