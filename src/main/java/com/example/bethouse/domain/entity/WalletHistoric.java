package com.example.bethouse.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity()
@Table(name = "wallet_history")
public class WalletHistoric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wallet_history_id;
    private float transaction_value;
    private String transaction_status;
    private LocalDate create_time;

    @ManyToOne
    @JoinColumn(name= "wallet_id", referencedColumnName ="wallet_id")
    private Wallet wallet;
}
