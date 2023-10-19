package com.example.bethouse.api.controller;

import com.example.bethouse.api.dto.walletDTO.WalletDTO;
import com.example.bethouse.api.dto.walletDTO.WalletFullDTO;
import com.example.bethouse.api.dto.walletDTO.WalletResponseDTO;
import com.example.bethouse.api.mapper.wallet.WalletMapper;
import com.example.bethouse.domain.entity.Wallet;
import com.example.bethouse.domain.service.WalletService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping()
    public ResponseEntity<Object> createWallet(@RequestBody WalletFullDTO walletFullDTO){

        this.walletService.createWallet(walletFullDTO);


        return ResponseEntity.status(201).body("carteira criada");

    }

    @GetMapping()
    public ResponseEntity<List<WalletResponseDTO>> getAllWallet(){
        List<Wallet> wallet = walletService.getAllCarteiras();

        List <WalletResponseDTO> response = WalletMapper.walletEntityToResponse(wallet);
        try{
            return ResponseEntity.status(200).body(response);
        }catch (Exception e){
            System.out.println(e);
            return ResponseEntity.status(400).body((List<WalletResponseDTO>) e);
        }

    }
}
