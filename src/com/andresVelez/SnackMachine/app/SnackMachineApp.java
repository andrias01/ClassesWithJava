package com.andresVelez.SnackMachine.app;

import com.andresVelez.SnackMachine.domain.Snack;
import com.andresVelez.SnackMachine.domain.SnackMachine;

public class SnackMachineApp {
    public static void main(String[] args) {

        SnackMachine snackMachine = new SnackMachine("Mecato");

        snackMachine.addSnack("1a","Detodito",6,5000);
        snackMachine.addSnack("2b","Barrilete",6,4500);
        snackMachine.addSnack("3c","Chokis",3,2000);
        snackMachine.addSnack("4d","Chocoramo",7,3200);//no lo toma porque hay mas de 6 unidades
        snackMachine.addSnack("5e","Jumbo",2,8000);
        snackMachine.addSnack("6f","Jet burbuja",8,600);//no lo toma porque hay mas de 6 unidades
        snackMachine.addSnack("7g","Cheese tris",4,1800);
        snackMachine.addSnack("8h","Papitas",1,1200);
        snackMachine.addSnack("9i","Bombon",6,500);
        snackMachine.addSnack("10j","Arequipe",5,3250);
        snackMachine.addSnack("11k","Paleta",4,300);
        snackMachine.addSnack("12l","Cheetos",3,2250);
        snackMachine.addSnack("13m","Quipitos",5,1350);
        snackMachine.addSnack("14n","Doritos",6,4000);
        snackMachine.addSnack("15o","Chicle",2,550);

        snackMachine.getSnacks();
        snackMachine.getASnackByCode("5e");
        snackMachine.getSnacks();
        snackMachine.addAmountOfSnack("1a");
        snackMachine.getSnacks();
        snackMachine.addAmountOfSnack("Cheese tris");
        snackMachine.getSnacks();
        snackMachine.delateSnack("3c");
        snackMachine.getSnacks();
        snackMachine.getAmountOfProductUnits("5e");
        snackMachine.getASnackByName("Jumbo");
        snackMachine.getSnacks();
        snackMachine.getASnackByName("Detodito");
        snackMachine.getASnackByName("Detodito");
        snackMachine.getASnackByName("Detodito");
        snackMachine.getASnackByName("Detodito");
        snackMachine.getASnackByName("Detodito");
        snackMachine.getASnackByName("Detodito");
        snackMachine.getSnacks();
        snackMachine.productsAreOutOfStock();
        snackMachine.currentAmountOfProducts();
        snackMachine.orderSnacksByCost();
        snackMachine.getSnacks();
        snackMachine.orderSnacksByAmount();
        snackMachine.getSnacks();

    }
}
