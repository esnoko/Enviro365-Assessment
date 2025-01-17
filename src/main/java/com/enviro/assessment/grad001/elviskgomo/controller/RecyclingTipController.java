package com.enviro.assessment.grad001.elviskgomo.controller;

import com.enviro.assessment.grad001.elviskgomo.model.RecyclingTip;
import com.enviro.assessment.grad001.elviskgomo.services.RecylingTipService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/recyling-tips")
public class RecyclingTipController {
    private final RecylingTipService service;

    public RecyclingTipController (RecylingTipService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<RecyclingTip>> getAllTips(){
        return ResponseEntity.ok(service.getAllTip());
    }

    @PostMapping
    public ResponseEntity<RecyclingTip> createTip(@RequestBody RecyclingTip tip){
        return ResponseEntity.ok(service.createTip(tip));
    }
}
