package com.example.bethouse.api.mapper.user;

import com.example.bethouse.api.dto.userDTO.CreateUserDTO;
import com.example.bethouse.api.dto.userDTO.CreateUserResponse;
import com.example.bethouse.domain.entity.User;

public class UserMapper {

    public static User toUserEntity(CreateUserDTO data){
        User user = new User();
        user.setName(data.name());
        user.setDob(data.dob());
        user.setCpf(data.cpf());
        user.setEmail(data.email());

        return user;
    }

    public static CreateUserResponse CreateUserResponse (User user){
        CreateUserResponse userResponse = new CreateUserResponse(
                user.getUser_id(),
                user.getName(),
                user.getDob(),
                user.getCpf(),
                user.getEmail(),
                user.getCreated_at()
                );
        return userResponse;
    }
}
