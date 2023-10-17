package com.example.bethouse.domain.service;

import com.example.bethouse.api.dto.statusDTO.CreateStatusDTO;
import com.example.bethouse.domain.entity.Status;
import com.example.bethouse.domain.repository.StatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class StatusService {
    private final StatusRepository statusRepository;


    public void createStatus(CreateStatusDTO statusValues){
        Status status = new Status();
        status.setStatus(statusValues.value());
        this.statusRepository.save(status);
    }
}
