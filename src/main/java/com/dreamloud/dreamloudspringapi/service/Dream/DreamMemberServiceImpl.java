package com.dreamloud.dreamloudspringapi.service.Dream;

import com.dreamloud.dreamloudspringapi.domain.DreamMember;
import com.dreamloud.dreamloudspringapi.repositories.DreamMemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DreamMemberServiceImpl implements DreamMemberService {

    private final DreamMemberRepository dreamMemberRepository;

    public DreamMemberServiceImpl(DreamMemberRepository dreamMemberRepository) {
        this.dreamMemberRepository = dreamMemberRepository;
    }

    @Override
    public List<DreamMember> findAllDreamMembers() {
        return dreamMemberRepository.findAll();
    }

    @Override
    public List<DreamMember> findAllByDreamId(Long drmId) {
        return dreamMemberRepository.findAllByDrmId(drmId);
    }

    @Override
    public DreamMember saveDreamMember(DreamMember dreamMember) {
        return dreamMemberRepository.save(dreamMember);
    }

    @Override
    public void deleteDreamMember(DreamMember dreamMember) {
        dreamMemberRepository.delete(dreamMember);
    }
}
