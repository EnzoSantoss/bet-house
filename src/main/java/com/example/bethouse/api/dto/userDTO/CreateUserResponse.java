package com.example.bethouse.api.dto.userDTO;

import java.time.LocalDate;

public record CreateUserResponse(
        Long user_id,
        String name,
        LocalDate dob,
        String cpf,
        String email,
        LocalDate created_at) {
}
