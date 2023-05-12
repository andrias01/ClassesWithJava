package com.andresVelez.Desafio2.domain;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract long calcularSalario();
    public abstract void validata();
}
