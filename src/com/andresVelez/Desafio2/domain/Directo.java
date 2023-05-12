package com.andresVelez.Desafio2.domain;

import com.andresVelez.Desafio2.exception.invalidPayrollValueException;

public class Directo extends Empleado {
    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    public long calcularSalud() {
        return (long) (salario * 0.05);
    }

    public long calcularPension() {
        return (long) (salario * 0.065);
    }

    public long calcularAporte() {
        return calcularSalud() + calcularPension();
    }

    @Override
    public long calcularSalario() {
        return salario - calcularAporte();
    }

    @Override
    public void validata() {
        if (this.salario < 0){
            throw new invalidPayrollValueException(nombre+" Esta nomina es invalida su valor es negativo "+ salario + "$ revisar denuevo");
        }

    }

}
