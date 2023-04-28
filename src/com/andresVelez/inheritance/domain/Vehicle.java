package com.andresVelez.inheritance.domain;

import java.util.Random;

public class Vehicle {
    private String license;
    private String brand;
    private String model;
    private int year;
    protected int speed;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void accelerate() {
        this.speed = this.speed + new Random().nextInt(30);
        System.out.println("Vehicle Accelerate - Current speed " + this.speed + " km/h");
    }

    public void brake() {
        this.speed = this.speed - new Random().nextInt(this.speed);
        System.out.println("Vehicle Brake - Current speed " + this.speed + " km/h");
    }

    public String getLicense() {
        return license;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
