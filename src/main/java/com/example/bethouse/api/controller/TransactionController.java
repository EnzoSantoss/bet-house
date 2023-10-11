package com.example.bethouse.api.controller;

import com.example.bethouse.api.dto.Transaction.CreateTransaction;
import com.example.bethouse.domain.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trasaction")
public class TransactionController {
    private final TransactionService transactionService;
    TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }
    @PostMapping("/{id}")
    public ResponseEntity<Object> createTransaction(@PathVariable Integer id, @RequestBody CreateTransaction createTransaction){

        try{
            Object result = transactionService.createTransaction(id, createTransaction);
            return ResponseEntity.status(HttpStatus.OK).body("");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }
}
