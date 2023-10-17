package com.example.bethouse.api.controller;

import com.example.bethouse.api.dto.statusDTO.CreateStatusDTO;
import com.example.bethouse.domain.service.StatusService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/status")
public class StatusController {
    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @PostMapping()
    public ResponseEntity<Object> createStatus(@RequestBody CreateStatusDTO createStatus){
        this.statusService.createStatus(createStatus);

        return  ResponseEntity.status(201).body("status created");
    }
}
