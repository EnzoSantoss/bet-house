package com.example.bethouse.api.dto.walletDTO;

import com.example.bethouse.api.dto.userDTO.SimpleUserDto;
import com.example.bethouse.api.dto.userDTO.UserDTO;
import com.example.bethouse.domain.entity.Status;

import java.util.Set;

public record WalletResponseDTO(Long wallet_id, float value, SimpleUserDto user, Set<Status> status) {
}
