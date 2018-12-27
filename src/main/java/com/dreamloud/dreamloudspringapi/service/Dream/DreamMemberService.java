package com.dreamloud.dreamloudspringapi.service.Dream;

import com.dreamloud.dreamloudspringapi.domain.DreamMember;

import java.util.List;

public interface DreamMemberService {

    List<DreamMember> findAllDreamMembers();

    List<DreamMember> findAllByDreamId(Long drmId);

    DreamMember saveDreamMember(DreamMember dreamMember);

    void deleteDreamMember(DreamMember dreamMember);
}
