package com.andresVelez.Desafio2.domain;

import com.andresVelez.Desafio2.exception.invalidPayrollValueException;

public class Promotor extends Empleado{
    private int volantesRepartidos;
    private  long valorVolante;
    private int comprasVolante;

    public Promotor(String nombre, int volantesRepartidos, long valorVolante,int comprasVolante) {
        super(nombre);
        this.volantesRepartidos=volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    @Override
    public long calcularSalario() {
        int valorVolantesRepartidosSinCompra = (int) ((volantesRepartidos-comprasVolante)*valorVolante);
        long valorVolantesRepartidosConCompra = comprasVolante*15_000;
        return valorVolantesRepartidosSinCompra+valorVolantesRepartidosConCompra;
    }

    @Override
    public void validata() {
        if (calcularSalario() < 0){
            throw new invalidPayrollValueException("Esta nomina es invalida su valor es negativo "+ calcularSalario() + "$ revisar denuevo");
        }
    }
}