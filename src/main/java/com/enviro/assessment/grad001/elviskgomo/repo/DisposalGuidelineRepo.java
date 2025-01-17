package com.enviro.assessment.grad001.elviskgomo.repo;

import com.enviro.assessment.grad001.elviskgomo.model.DisposalGuideline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DisposalGuidelineRepo extends JpaRepository<DisposalGuideline, Long> {
}
