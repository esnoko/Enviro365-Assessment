package com.enviro.assessment.grad001.elviskgomo.services;

import com.enviro.assessment.grad001.elviskgomo.model.WasteCategory;
import com.enviro.assessment.grad001.elviskgomo.repositories.WasteCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteCategoryService {

    private final WasteCategoryRepository repo;

    public WasteCategoryService(WasteCategoryRepository repo) {
        this.repo = repo;
    }

    public List<WasteCategory> getAllCategories() {
        return repo.findAll();
    }

    public WasteCategory getCategoryById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Category not found."));
    }

    public WasteCategory createCategory(WasteCategory category) {
        return repo.save(category);
    }

    public WasteCategory updateCategory(Long id, WasteCategory category) {
        WasteCategory existing = getCategoryById(id);
        existing.setName(category.getName());
        existing.setDesc(category.getDesc());
        return repo.save(existing);
    }

    public void deleteCategory(Long id) {
        repo.deleteById(id);
    }

    public List<WasteCategory> searchCategoriesByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }
}
