package com.andresVelez.inheritance.domain;

import java.util.Random;

public class Car extends Vehicle {

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public String toString() {
        return "Soy un carro 🚗";
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + new Random().nextInt(80);
        System.out.println("Car Accelerate - Current speed " + this.speed + " km/h");
    }
}
