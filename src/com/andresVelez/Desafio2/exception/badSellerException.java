package com.andresVelez.Desafio2.exception;

public class badSellerException extends RuntimeException{
    public badSellerException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Hola !! importante "+super.getMessage();
    }
}