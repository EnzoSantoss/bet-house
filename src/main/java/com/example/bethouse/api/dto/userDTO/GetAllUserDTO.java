package com.example.bethouse.api.dto.userDTO;

import com.example.bethouse.api.dto.walletDTO.WalletDTO;

import java.time.LocalDate;
import java.util.List;

public record GetAllUserDTO(Long user_id, String name, LocalDate dob, List<WalletDTO> wallets) {
}
