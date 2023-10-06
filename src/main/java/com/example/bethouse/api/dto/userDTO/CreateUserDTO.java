package com.example.bethouse.api.dto.userDTO;

import java.time.LocalDate;


public record CreateUserDTO(String name, LocalDate dob, String cpf, String email) {
}
