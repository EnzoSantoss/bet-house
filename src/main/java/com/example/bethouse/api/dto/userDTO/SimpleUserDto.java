package com.example.bethouse.api.dto.userDTO;

import java.time.LocalDate;

public record SimpleUserDto(Long user_id,String name ,LocalDate dob, String cpf) {
}
