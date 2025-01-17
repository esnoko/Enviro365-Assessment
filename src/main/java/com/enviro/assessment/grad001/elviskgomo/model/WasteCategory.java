package com.enviro.assessment.grad001.elviskgomo.model;

import jakarta.persistence.*;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class WasteCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 500)
    @Size(max = 255, message = "Description can't be longer than 255 characters")
    private String desc;
    @Column(nullable = false, unique = true)
    @NotNull(message = "Name is required")
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DisposalGuideline> disposalGuidelines;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecyclingTip> recyclingTips;


    //Get ID
    public Long getId(){
        return id;
    }

    //Set ID
    public void setId(Long id) {
        this.id = id;
    }

    //Get name getter
    public String getName(){
        return name;
    }

    //Set name
    public void setName(String name){
        this.name = name;
    }

    //Get description
    public String  getDesc(){
        return desc;
    }

    //Set description

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
