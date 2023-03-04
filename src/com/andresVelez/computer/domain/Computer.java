package com.andresVelez.computer.domain;

public class Computer {
    public String brand;
    public int serial;
    public int speed;
    public int temperature;
    public String typePC;

    public Computer(String brand, int serial,String typePC) {
        this.brand = brand;
        this.serial = serial;
        this.typePC = typePC;
    }
    public String getCurrentTypePC() {
        return "The type of PC is: "+this.typePC;
    }
}
