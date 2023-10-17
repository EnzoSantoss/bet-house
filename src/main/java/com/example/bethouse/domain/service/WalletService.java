package com.example.bethouse.domain.service;

import com.example.bethouse.api.dto.walletDTO.WalletFullDTO;
import com.example.bethouse.domain.entity.User;
import com.example.bethouse.domain.entity.Wallet;
import com.example.bethouse.domain.repository.StatusRepository;
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
    private final StatusRepository statusRepository;

    public Object createWallet(WalletFullDTO walletFullDTO){
        Wallet wallet = new Wallet();
        User user = this.userRepository.findById(walletFullDTO.user_id()).get();
        wallet.setUser(user);
        wallet.setValue(walletFullDTO.value());

    }

    public Object createTransaction (Integer id){
        System.out.println(id);

        return id;
    }
}
