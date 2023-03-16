package com.andresVelez.bicycle.app;

import com.andresVelez.bicycle.domain.Bicycle;

public class BicycleApp {
    public static void main(String[] args) {
        Bicycle myBici = new Bicycle(123,"chimano","Blanco");

        System.out.println("La bicicleta de serie: " + myBici.getSerial());
        System.out.println("La bicicleta de Marca: " + myBici.getBrand());
        System.out.println("La bicicleta de Color: " + myBici.getColor());
        System.out.println("Va hacer una presentación !! ");

        myBici.accelerating(20);
        myBici.upChange();
        myBici.upChange();
        myBici.upChange();
        myBici.upChange();
        myBici.upChange();
        myBici.upChange();
        myBici.upChange();

        myBici.accelerating(15);
        System.out.println("La actual velocidad de la bicicleta es: "+ myBici.getSpeed());
        myBici.downChange();
        myBici.braking(19);
        System.out.println("La actual velocidad de la bicicleta es: "+ myBici.getSpeed());
        myBici.downChange();

        System.out.println(myBici.getCurrentSpeed());
    }
}
