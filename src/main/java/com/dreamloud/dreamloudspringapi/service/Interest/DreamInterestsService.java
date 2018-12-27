package com.dreamloud.dreamloudspringapi.service.Interest;


import com.dreamloud.dreamloudspringapi.domain.DreamInterests;

import java.util.List;

public interface DreamInterestsService {
    List<DreamInterests> findAllByDreamId(Long dreamId);
    List<DreamInterests> findAllDreamInterests();

    DreamInterests findDreamInterestById(Long dreamIntrId);

    DreamInterests saveDreamInterests(DreamInterests dreamInterests);

    void deleteDreamInterests(DreamInterests dreamInterests);
}
