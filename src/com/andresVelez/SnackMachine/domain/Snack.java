package com.andresVelez.SnackMachine.domain;

public class Snack {
    private String code;
    private String name;
    private int amount;
    private double cost;

    public Snack(String code, String name, int amount, double cost) {
        this.code = code;
        this.name = name;
        this.amount = amount;
        this.cost = cost;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
