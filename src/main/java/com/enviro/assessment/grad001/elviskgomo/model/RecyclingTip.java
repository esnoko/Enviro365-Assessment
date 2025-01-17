package com.enviro.assessment.grad001.elviskgomo.model;

import jakarta.persistence.*;

@Entity
public class RecyclingTip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String tip;
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

    //Get tip
    public String getTip() {
        return tip;
    }

    //Set tip
    public void setTip(String tip) {
        this.tip = tip;
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
