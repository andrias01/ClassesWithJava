package com.andresVelez.ExamenParcialGood.domain;

public class Paciente2 {
    private long cedula;
    private String nombre;

    public Paciente2(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}
