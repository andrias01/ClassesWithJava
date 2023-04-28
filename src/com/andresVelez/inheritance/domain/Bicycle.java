package com.andresVelez.inheritance.domain;

import java.util.Random;

public class Bicycle extends Vehicle {
    private int changes;
    private double cadence;

    public Bicycle(String brand, String model, int year, int changes) {
        super(brand, model, year);
        this.changes = changes;
    }

    @Override
    public void accelerate() {
        super.speed = super.speed + new Random().nextInt(20);
        System.out.println("Bicycle Accelerate - Current speed " + this.speed + " km/h");
        super.accelerate();
    }

    @Override
    public String toString() {
        return "🚲 {" +
                "changes=" + changes +
                ", cadence=" + cadence +
                ", brand=" + getBrand() +
                ", model=" + getModel() +
                '}';
    }

    public int getChanges() {
        return changes;
    }

    public void setChanges(int changes) {
        this.changes = changes;
    }

    public double getCadence() {
        return cadence;
    }

    public void setCadence(double cadence) {
        this.cadence = cadence;
    }
}
