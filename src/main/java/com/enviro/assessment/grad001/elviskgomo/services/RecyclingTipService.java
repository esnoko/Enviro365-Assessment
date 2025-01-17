package com.enviro.assessment.grad001.elviskgomo.services;

import com.enviro.assessment.grad001.elviskgomo.model.RecyclingTip;
import com.enviro.assessment.grad001.elviskgomo.repositories.RecyclingTipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecyclingTipService {

    @Autowired
    private RecyclingTipRepository recyclingTipRepository;

    public List<RecyclingTip> getAllTips() {
        return recyclingTipRepository.findAll();
    }

    public RecyclingTip createTip(RecyclingTip recyclingTip) {
        return recyclingTipRepository.save(recyclingTip);
    }

    public RecyclingTip getTipById(Long id) {
        return recyclingTipRepository.findById(id).orElse(null);
    }
}
