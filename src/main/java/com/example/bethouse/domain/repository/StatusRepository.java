package com.example.bethouse.domain.repository;

import com.example.bethouse.domain.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
