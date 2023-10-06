package com.example.bethouse.domain.service;

import com.example.bethouse.domain.entity.User;
import com.example.bethouse.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(User data){
        return userRepository.save(data);
    }
    public Object getUser(){
        return "retornando usuario";
    }
}
