package com.example.bethouse.domain.service;

import com.example.bethouse.api.dto.walletDTO.WalletFullDTO;
import com.example.bethouse.api.dto.walletDTO.WalletResponseDTO;
import com.example.bethouse.api.mapper.wallet.WalletMapper;
import com.example.bethouse.domain.entity.Status;
import com.example.bethouse.domain.entity.User;
import com.example.bethouse.domain.entity.Wallet;
import com.example.bethouse.domain.repository.StatusRepository;
import com.example.bethouse.domain.repository.UserRepository;
import com.example.bethouse.domain.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
@RequiredArgsConstructor
public class WalletService {

    private final UserRepository userRepository;
    private final WalletRepository walletRepository;
    private final StatusRepository statusRepository;

    public void createWallet(WalletFullDTO walletFullDTO){
        Wallet wallet = new Wallet();
        User user = this.userRepository.findById(walletFullDTO.user_id()).get();
        wallet.setUser(user);
        wallet.setValue(walletFullDTO.value());

        //Relacionando carteira com status
        Status status = this.statusRepository.findById(walletFullDTO.status_id()).get();
        Set<Status> statusesReletated = wallet.getStatuses();

        if(statusesReletated == null){
            statusesReletated = new HashSet<>();
        }

        statusesReletated.add(status);

        wallet.setStatuses(statusesReletated);

        walletRepository.save(wallet);

    }

    public List<Wallet> getAllCarteiras(){
        List<Wallet> wallet =  walletRepository.findAll();

        return wallet;
    }

    public Object createTransaction (Integer id){
        System.out.println(id);

        return id;
    }
}
