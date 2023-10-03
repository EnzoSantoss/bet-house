package com.example.bethouse.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    @Column(name="name")
    private String name;
    @Column(name="dob")
    private Date dob;
    @Column(name="cpf")
    private String cpf;
    @Column(name="email")
    private String email;
    @Column(name="created_at")
    private LocalDateTime created_at;
}
