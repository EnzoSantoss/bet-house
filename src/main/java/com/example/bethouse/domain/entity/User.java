package com.example.bethouse.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "bet_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    @Column(name="name")
    private String name;
    @Column(name="dob")
    private LocalDate dob;
    @Column(name="cpf")
    private String cpf;
    @Column(name="email")
    private String email;
    @Column(name="created_at")
    private LocalDate created_at;


    //Create constructor
    public User(String name, LocalDate dob, String cpf, String email) {
        this.name = name;
        this.dob = dob;
        this.cpf = cpf;
        this.email = email;
    }
}
