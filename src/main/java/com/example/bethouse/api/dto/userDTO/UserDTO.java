package com.example.bethouse.api.dto.userDTO;

import com.example.bethouse.api.dto.walletDTO.WalletDTO;
import com.example.bethouse.domain.entity.Wallet;

import java.time.LocalDate;
import java.util.List;

public record UserDTO(Long user_id, String name, LocalDate dob, String cpf, WalletDTO walletDTO) {
}
