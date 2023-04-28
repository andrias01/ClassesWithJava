package com.andresVelez.inheritance.domain;

public class Taxi extends Car {
    private String circulationGrant;
    private String company;
    private int passengers;

    public Taxi(String brand, String model, int year, String company) {
        super(brand, model, year);
        this.company = company;
    }

    public void putPassenger() {
        if (this.passengers < 4) {
            this.passengers++;
            System.out.println("PUT - Current passengers: " + this.passengers);
        } else {
            System.out.println("Taxi full");
        }
    }

    public void removePassenger() {
        if (this.passengers > 0) {
            this.passengers--;
            System.out.println("REMOVE - Current passengers: " + this.passengers);
        } else {
            System.out.println("👻");
        }
    }

    @Override
    public String toString() {
        return "Soy un taxi de " + this.company + " 🚕";
    }

    public String getCirculationGrant() {
        return circulationGrant;
    }

    public String getCompany() {
        return company;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setCirculationGrant(String circulationGrant) {
        this.circulationGrant = circulationGrant;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
