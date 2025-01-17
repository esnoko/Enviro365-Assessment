package com.enviro.assessment.grad001.elviskgomo.repo;

import com.enviro.assessment.grad001.elviskgomo.model.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface WasteCategoryRepo extends JpaRepository<WasteCategory, Long> {
}
