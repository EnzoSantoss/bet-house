package com.example.bethouse.api.controller;

import com.example.bethouse.api.dto.walletDTO.WalletDTO;
import com.example.bethouse.api.dto.walletDTO.WalletFullDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @PostMapping()
    public ResponseEntity<Object> createWallet(@RequestBody WalletFullDTO walletFullDTO){

        System.out.println(walletFullDTO);

        return ResponseEntity.status(201).body("carteira criada");

    }
}
