package com.example.demo.controller;

import com.example.demo.entity.Sight;
import com.example.demo.service.SightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class SightController {
    @Autowired
    private SightService sightService;
    @GetMapping("/SightAPI")
    public ResponseEntity<List<Sight>> getSight(
            @RequestParam(value = "zone", defaultValue = "") String name) {
            List<Sight> sights = sightService.getSight(name);
            return ResponseEntity.ok(sights);
    }
}