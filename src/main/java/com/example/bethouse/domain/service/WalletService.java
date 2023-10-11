package com.example.bethouse.domain.service;

import com.example.bethouse.domain.repository.UserRepository;
import com.example.bethouse.domain.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class WalletService {

    private final UserRepository userRepository;
    private final WalletRepository walletRepository;

    public Object createTransaction (Integer id){
        System.out.println(id);

        return id;
    }
}
