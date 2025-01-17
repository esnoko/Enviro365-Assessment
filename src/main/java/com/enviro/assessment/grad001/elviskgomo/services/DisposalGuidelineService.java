package com.enviro.assessment.grad001.elviskgomo.services;

import com.enviro.assessment.grad001.elviskgomo.model.DisposalGuideline;
import com.enviro.assessment.grad001.elviskgomo.repositories.DisposalGuidelineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisposalGuidelineService {

    private final DisposalGuidelineRepository repo;

    public DisposalGuidelineService(DisposalGuidelineRepository repo) {
        this.repo = repo;
    }

    public List<DisposalGuideline> getAllGuidelines() {
        return repo.findAll();
    }

    public DisposalGuideline createGuideline(DisposalGuideline guideline) {
        return repo.save(guideline);
    }
}
