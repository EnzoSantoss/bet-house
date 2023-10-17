package com.example.bethouse.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long status_id;
    private String status;

    @ManyToMany(mappedBy = "statuses")
    private Set<Wallet> wallets;

    public Status(String status) {
        this.status = status;
    }
}


