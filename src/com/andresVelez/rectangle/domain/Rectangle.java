package com.andresVelez.rectangle.domain;

public class Rectangle {
    public String name;
    public double twoSidesA;
    public double twoSidesB;
    public double diagonals;
    public double lengthDiagonals;
    public double perimeter;
    public int area;

    public Rectangle(String name, double twoSidesA, double twoSidesB) {
        this.name = name;
        this.twoSidesA = twoSidesA;
        this.twoSidesB = twoSidesB;
    }

    public void greet(){
        System.out.println("***************************************** ");
        System.out.println("Hola mi nombre es " + this.name);
        System.out.println("Tengo dos lados A que miden " + this.twoSidesA);
        System.out.println("Tengo dos lados B que miden " + this.twoSidesB);
        System.out.println("Espero que puedas calcular todo de mi ");
        System.out.println("***************************************** ");
    }

    public double countDiagonals(){
        byte n = 4;
        this.diagonals=((n*(n-3)))%2;
        return this.diagonals;
    }
    public void measureDiagonal(){
        double A = this.twoSidesA;
        double B = this.twoSidesB;
        this.lengthDiagonals = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        System.out.println("--La longitud de las DIAGONALES del "+ this.name + " miden cada una: "+ this.lengthDiagonals);
    }
    public void measurePerimeter(){
        this.perimeter = 2*(this.twoSidesA+this.twoSidesB);
        System.out.println("--El PERIMETRO del "+ this.name + " mide: "+ this.perimeter);
    }
    public void measureArea(){
        this.perimeter = this.twoSidesA*this.twoSidesB;
        System.out.println("--El AREA del "+ this.name + " es de: "+ this.perimeter);
    }


}
