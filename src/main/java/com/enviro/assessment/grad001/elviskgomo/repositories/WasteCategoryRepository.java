package com.enviro.assessment.grad001.elviskgomo.repositories;

import com.enviro.assessment.grad001.elviskgomo.model.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Long> {
    List<WasteCategory> findByNameContainingIgnoreCase(String name);
}
