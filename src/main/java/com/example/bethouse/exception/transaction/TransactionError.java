package com.example.bethouse.exception.transaction;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class TransactionError extends RuntimeException {
    public TransactionError(String message) {
        super(message);
    }
}
