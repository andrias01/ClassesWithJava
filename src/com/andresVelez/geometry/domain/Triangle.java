package com.andresVelez.geometry.domain;

public class Triangle extends GeometricShape {
    private double sideOne;
    private double sideTwo;
    private double sidethree;
    private String shape;

    public Triangle(double sideOne, double sideTwo, double sidethree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sidethree = sidethree;
    }

    @Override
    public String toString() {
        return "Hola soy un triangulo 📐";
    }

    public void findShape(int side1, int side2, int side3) {
        if (side1 == side2 && side2 == side3) {
            this.shape= "Equilátero";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            this.shape= "Isósceles";
        } else {
            this.shape= "Escaleno";
        }
    }
}
