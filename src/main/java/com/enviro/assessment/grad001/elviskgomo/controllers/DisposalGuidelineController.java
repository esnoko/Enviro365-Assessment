package com.enviro.assessment.grad001.elviskgomo.controllers;

import com.enviro.assessment.grad001.elviskgomo.model.DisposalGuideline;
import com.enviro.assessment.grad001.elviskgomo.services.DisposalGuidelineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disposal-guidelines")
public class DisposalGuidelineController {

    private final DisposalGuidelineService service;

    public DisposalGuidelineController(DisposalGuidelineService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DisposalGuideline>> getAllGuidelines() {
        return ResponseEntity.ok(service.getAllGuidelines());
    }

    @PostMapping
    public ResponseEntity<DisposalGuideline> createGuideline(@RequestBody DisposalGuideline guideline) {
        return ResponseEntity.ok(service.createGuideline(guideline));
    }
}
