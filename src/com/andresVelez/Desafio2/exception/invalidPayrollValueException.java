package com.andresVelez.Desafio2.exception;

public class invalidPayrollValueException extends RuntimeException{
    public invalidPayrollValueException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Hola !! importante "+super.getMessage();
    }
}
