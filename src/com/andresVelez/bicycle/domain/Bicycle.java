package com.andresVelez.bicycle.domain;

public class Bicycle {
    private long serial; // +serial: long
    private String brand;
    private String color;
    private double speed;
    private byte currentChange = 1;
    private byte maxChange = 7;

    public Bicycle(long serial, String brand, String color) {
        this.serial = serial;
        this.brand = brand;
        this.color = color;
    }

    // +accelerating(in amount:int)
    public void accelerating(int amount) {
        this.speed += amount;
    }

    // +braking(in amount:int)
    public void braking(int amount) {
        if (this.speed - amount < 0) {
            System.out.println("The bicycle is stopped.");
        } else {
            this.speed -= amount;
        }
    }

    // +upChange(): boolean
    public boolean upChange() {
        if (this.currentChange + 1 > this.maxChange) {
            System.out.println("Cannot up change.");
            return false;
        }

        this.currentChange++;
        System.out.println("Current change: " + this.currentChange);
        return true;
    }

    // +downChange(): boolean
    public boolean downChange() {
        if (this.currentChange - 1 == 0) {
            System.out.println("Cannot down change.");
            return false;
        }

        this.currentChange--;
        System.out.println("Current change: " + this.currentChange);
        return true;
    }

    public String getCurrentSpeed() {
        return "The current speed is " + this.speed + " km/h & the current change is " + this.currentChange;
    }

    public long getSerial() {
        return serial;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    public byte getCurrentChange() {
        return currentChange;
    }

    public byte getMaxChange() {
        return maxChange;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setCurrentChange(byte currentChange) {
        this.currentChange = currentChange;
    }

    public void setMaxChange(byte maxChange) {
        this.maxChange = maxChange;
    }
}
