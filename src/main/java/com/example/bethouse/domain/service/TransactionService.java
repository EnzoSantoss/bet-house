package com.example.bethouse.domain.service;

import com.example.bethouse.api.dto.Transaction.CreateTransaction;
import com.example.bethouse.api.dto.userDTO.UserDTO;
import com.example.bethouse.api.mapper.user.UserMapper;
import com.example.bethouse.domain.entity.User;
import com.example.bethouse.domain.entity.WalletHistoric;
import com.example.bethouse.domain.repository.UserRepository;
import com.example.bethouse.domain.repository.WalletHistoricRepository;
import com.example.bethouse.domain.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
@Transactional
@RequiredArgsConstructor
public class TransactionService {

    private final UserRepository userRepository;
    private final WalletRepository walletRepository;
    private final WalletHistoricRepository walletHistoricRepository;
    private final UserService userService;


    public Object createTransaction(Integer id, CreateTransaction transactionData){
        User user = userService.findUserById(id);

        UserDTO userDTO = UserMapper.entityToUser(user);

        if(transactionData.value() > userDTO.walletDTO().value()){

            WalletHistoric walletHistoric = new WalletHistoric();
            walletHistoric.setTransaction_value(transactionData.value());
            walletHistoric.setTransaction_status("Transation Fail");
            walletHistoric.setWallet(user.getWallets().get(0));
            walletHistoric.setCreate_time(LocalDate.now());

            walletHistoricRepository.save(walletHistoric);

            throw new TransactionException("Saldo insuficiente") {
            };
        }

        return "ok";
    }

}
