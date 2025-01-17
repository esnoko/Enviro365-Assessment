package com.enviro.assessment.grad001.elviskgomo.services;

import com.enviro.assessment.grad001.elviskgomo.model.RecyclingTip;
import com.enviro.assessment.grad001.elviskgomo.repo.RecyclingTipRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecylingTipService {
    private final RecyclingTipRepo repo;
    public RecylingTipService(RecyclingTipRepo repo){
        this.repo = repo;
    }

    public List<RecyclingTip> getAllTip(){
        return repo.findAll();
    }
}
