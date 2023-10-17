package com.example.bethouse.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wallet_id;
    private float value;


    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @OneToMany(mappedBy = "wallet")
    private List<WalletHistoric> walletHistorics;

    @ManyToMany
    @JoinTable(
            name = "wallet_status",
            joinColumns = @JoinColumn(name = "wallet_id"),
            inverseJoinColumns = @JoinColumn(name = "status_id")
    )
    private Set<Status> statuses;

    public Wallet(Long wallet_id, float value) {
        this.wallet_id = wallet_id;
        this.value = value;
    }
}
