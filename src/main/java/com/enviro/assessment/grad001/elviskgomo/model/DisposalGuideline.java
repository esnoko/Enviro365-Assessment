package com.enviro.assessment.grad001.elviskgomo.model;

import jakarta.persistence.*;

@Entity
public class DisposalGuideline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String guideline;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private WasteCategory category;

    //Get ID
    public Long getId() {
        return id;
    }

    //Set ID
    public void setId(Long id) {
        this.id = id;
    }

    //Get guideline
    public String getGuideline() {
        return guideline;
    }

    //Set guideline
    public void setGuideline(String guideline) {
        this.guideline = guideline;
    }

    //Get category
    public WasteCategory getCategory() {
        return category;
    }

    //Set category
    public void setCategory(WasteCategory category) {
        this.category = category;
    }
}
