package com.example.bethouse.api.mapper.wallet;

import com.example.bethouse.api.dto.userDTO.SimpleUserDto;
import com.example.bethouse.api.dto.userDTO.UserDTO;
import com.example.bethouse.api.dto.walletDTO.WalletResponseDTO;
import com.example.bethouse.domain.entity.Status;
import com.example.bethouse.domain.entity.User;
import com.example.bethouse.domain.entity.Wallet;

import java.util.*;

public class WalletMapper {

    public static List<WalletResponseDTO>  walletEntityToResponse(List<Wallet> wallets){
        List<WalletResponseDTO> response = new ArrayList<>();

        for(Wallet wallet : wallets){
            User user = wallet.getUser();
            SimpleUserDto userDto = new SimpleUserDto(user.getUser_id(), user.getName(),user.getDob(),user.getCpf());
            Set<Status>statuses = wallet.getStatuses();

            WalletResponseDTO objt = new WalletResponseDTO(wallet.getWallet_id(),wallet.getValue(),userDto,statuses);

            response.add(objt);
        }


        return response;
    }
}
