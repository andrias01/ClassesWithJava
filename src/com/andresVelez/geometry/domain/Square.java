package com.andresVelez.geometry.domain;

public class Square extends GeometricShape {
    private double base;
    private double height;

    public Square(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Hola soy un cuadrado 🖼️";
    }

    @Override
    public double getArea() {
        return this.base*this.height;
    }

    @Override
    public double getPerimeter() {
        return this.base+this.base+this.height+this.height;
    }
}
