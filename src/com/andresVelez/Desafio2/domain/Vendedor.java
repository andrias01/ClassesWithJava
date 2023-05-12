package com.andresVelez.Desafio2.domain;

import com.andresVelez.Desafio2.exception.badSellerException;

public class Vendedor extends Directo{
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision() {
        if (ventasDelMes < 999_999) {
            return (long) (ventasDelMes * 0.045);
        } else {
            return (long) (ventasDelMes * 0.035);
        }
    }

    @Override
    public void validata() {
        int maximoVentas = 40_000_000;
        if (this.ventasDelMes <= maximoVentas){
            throw new badSellerException(nombre + " Eres un mal vendedor. No superastes los "+maximoVentas+" de pesos");
        }
    }

    @Override
    public long calcularSalario() {
        return super.calcularSalario() + calcularComision();
    }
}
