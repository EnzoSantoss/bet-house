package com.example.bethouse.api.controller;
import com.example.bethouse.api.dto.userDTO.CreateUserResponse;
import com.example.bethouse.api.dto.userDTO.GetAllUserDTO;
import com.example.bethouse.api.mapper.user.UserMapper;
import com.example.bethouse.api.dto.userDTO.CreateUserDTO;
import com.example.bethouse.api.mapper.user.UserMapper;
import com.example.bethouse.domain.entity.User;
import com.example.bethouse.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<Object> getUser(){

        try {
            List<User> result = userService.getUser();

            List<GetAllUserDTO> response = UserMapper.getAllUser(result);

            return ResponseEntity.status(HttpStatus.OK).body(response);

        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao buscar os usuários.");
        }
    }

    @PostMapping()
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserDTO data){

        User user = UserMapper.toUserEntity(data);
        User createUser = userService.createUser(user);

        CreateUserResponse response = UserMapper.CreateUserResponse(createUser);

        return ResponseEntity.status(HttpStatus.OK).body(response);

        //Object response = userService
    };

}
