package com.andresVelez.ExamenParcialGood.domain;

public class Enfermedad2 {
    private String nombre;
    private String gravedad;

    public Enfermedad2(String nombre, String gravedad) {
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    public Enfermedad2(String nombre) {
        this.nombre = nombre;
        this.gravedad = "nada grave";
    }

    public String getNombre() {
        return nombre;
    }

    public String getGravedad() {
        return gravedad;
    }
}
