package com.example.bethouse.api.mapper.user;

import com.example.bethouse.api.dto.userDTO.CreateUserDTO;
import com.example.bethouse.api.dto.userDTO.CreateUserResponse;
import com.example.bethouse.api.dto.userDTO.GetAllUserDTO;
import com.example.bethouse.api.dto.walletDTO.WalletDTO;
import com.example.bethouse.domain.entity.User;
import com.example.bethouse.domain.entity.Wallet;


import java.util.ArrayList;
import java.util.List;

public class UserMapper {

    public static User toUserEntity(CreateUserDTO data){
        User user = new User();
        user.setName(data.name());
        user.setDob(data.dob());
        user.setCpf(data.cpf());
        user.setEmail(data.email());

        return user;
    }

    public static CreateUserResponse CreateUserResponse (User user){
        CreateUserResponse userResponse = new CreateUserResponse(
                user.getUser_id(),
                user.getName(),
                user.getDob(),
                user.getCpf(),
                user.getEmail(),
                user.getCreated_at()
                );
        return userResponse;
    }

    public static List<GetAllUserDTO> getAllUser(List <User> users){

        List<GetAllUserDTO> allUsers = new ArrayList<>();

        for(User user : users){

            List<WalletDTO> wallets = new ArrayList<>();
            List<Wallet> walletsEntity = user.getWallets();

            for(Wallet wallet: walletsEntity){
                WalletDTO newWallet = new WalletDTO(wallet.getWallet_id(),wallet.getValue());
                wallets.add(newWallet);
            }

            GetAllUserDTO response = new GetAllUserDTO(
                    user.getUser_id(),
                    user.getName(),
                    user.getDob(),
                    wallets
            );

            allUsers.add(response);

        }


        return allUsers;
    }

}
