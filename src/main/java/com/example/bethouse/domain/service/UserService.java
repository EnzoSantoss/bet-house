package com.example.bethouse.domain.service;

import com.example.bethouse.domain.entity.User;
import com.example.bethouse.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(User data){
        return userRepository.save(data);
    }
    public List<User>  getUser(){

        return userRepository.findAll();
    }

    public User findUserById(Integer id){
        return userRepository.findUserTeste(id);
    }
}
