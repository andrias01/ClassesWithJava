package com.andresVelez.ContactBook.domain;

public class Contact {
    private String name;
    private String lastName;
    private long cellphoneNumber;

    public Contact(String name, String lastName, long cellphoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public long getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(long cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }
}
