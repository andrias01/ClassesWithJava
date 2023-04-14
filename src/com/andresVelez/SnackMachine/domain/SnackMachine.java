package com.andresVelez.SnackMachine.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SnackMachine {
    public static final byte maxSnacks = 12 ;
    public static final byte maxSpacesByProduct = 6 ;
    private String type;
    private List<Snack> snacks;
    private Snack snackToReturn = null;

    public SnackMachine(String type) {
        this.type = type;
        this.snacks = new ArrayList<>();
    }

    public boolean addSnack(String snackCode,String snackName,int amount , double snackCost){
        Snack snack = this.findSnackByCode(snackCode);//look for, if exist?

        if (this.snacks.size() < maxSnacks && snack == null && amount <= maxSpacesByProduct) {
            Snack snackToAdd = new Snack(snackCode, snackName,amount,snackCost);
            this.snacks.add(snackToAdd);
            return true;
        }
        if ((this.snacks.size()+1) > maxSnacks) {
            System.out.println("No more snacks can be added, it is at its set limit");
        } else {
            System.out.println("The amount of '"+snackName+"' you want to put is greater than 6");
        }
        return false;
    }


    public Snack getASnackByCode(String snackCode){
        boolean fingNotfing = false;
        for (Snack snack : this.snacks) {
            if ((snackCode.equalsIgnoreCase(snack.getCode())) && snack.getAmount() >= 1) {
                snack.setAmount(snack.getAmount()-1);
                snackToReturn = snack;
                System.out.println("Get the snack '"+snack.getName()+"' successfully !!!!");
                fingNotfing = true;
                break;
            }
        }
        if (fingNotfing==false){
            System.out.println("There isnt units of snack with the NAME or CODE: '"+snackCode+"'");
        }
        return snackToReturn;
    }

    public Snack getASnackByName(String snackName){
        boolean fingNotfing = false;
        for (Snack snack : this.snacks) {
            if ((snackName.equalsIgnoreCase(snack.getName())) && snack.getAmount() >= 1) {
                snack.setAmount(snack.getAmount()-1);
                snackToReturn = snack;
                System.out.println("Get the snack '"+snack.getName()+"' successfully !!!!");
                fingNotfing = true;
                break;
            }
        }
        if (fingNotfing==false){
            System.out.println("There isnt units of snack with the NAME or CODE: '"+snackName+"'");
        }
        return snackToReturn;
    }

    public Snack addAmountOfSnack(String codeOrName) {
        boolean fingNotfing = false;
        for (Snack snack : this.snacks) {
            if ((codeOrName.equalsIgnoreCase(snack.getCode()) || (codeOrName.equalsIgnoreCase(snack.getName()))) && (snack.getAmount()+1) <= maxSpacesByProduct) {
                snack.setAmount(snack.getAmount() + 1);
                snackToReturn = snack;
                System.out.println("Added a unit of snack '"+snack.getName()+"'");
                fingNotfing = true;
                break;
            }
        }
        if (fingNotfing==false){
            System.out.println("No space left for snack with the NAME or CODE: '"+codeOrName+"'");
        }
        return snackToReturn;
    }

    public void delateSnack(String snackCode) {
        Snack snack = this.findSnackByCode(snackCode);
        if (snack != null) {
            this.snacks.remove(snack);
            System.out.println("The snack name '" + snack.getName() + "' was removed!!.");
        } else {
            System.out.println("The snack name '" + snack.getName() + "' doesnt exist.");
        }
    }

    public Snack getAmountOfProductUnits(String snackCode){
        for (Snack snack : this.snacks) {
            if (snackCode.equalsIgnoreCase(snackCode)) {
                snackToReturn = snack;
                System.out.println("The snack '"+snack.getName()+"' was found and their currentAmount is:");
                System.out.println("CURRENT AMOUNT: "+snack.getAmount());
                break;
            }
        }
        return snackToReturn;
    }

    public Snack findSnackByCode(String snackCode) {
        for (Snack snack : this.snacks) {
            if (snackCode.equalsIgnoreCase(snack.getCode())) {
                snackToReturn = snack;
                System.out.println("The snack was found and their data is:");
                System.out.println("Code: "+snack.getCode()+" snackName: "+snack.getName()+" snackCost: "+snack.getCost()+"$ currentAmount: "+snack.getAmount());
                break;
            }
        }
        return snackToReturn;
    }

    public List<Snack> productsAreOutOfStock() {
        System.out.println("\nCurrent SnackMachine products Are Out Of Stock");
        for (Snack snack : this.snacks) {
            if (snack.getAmount()==0){
                System.out.println("Snack with the name: '"+snack.getName()+"' is out of STOCK" );
            }
        }
        System.out.println("\n");
        return this.snacks;
    }

    public List<Snack> currentAmountOfProducts() {
        System.out.println("\nCurrent SnackMachine inventory");
        for (Snack snack : this.snacks) {
            System.out.println("snackName: "+snack.getName()+" || currentAmount: "+snack.getAmount()+" units");
        }
        System.out.println("\n");
        return this.snacks;
    }

    public void orderSnacksByCost() {
        System.out.println("List ordered by cost increasing");
        this.snacks.sort(Comparator.comparing(Snack::getCost).reversed());
    }
    public void orderSnacksByAmount() {
        System.out.println("List ordered by amount decreasing");
        this.snacks.sort(Comparator.comparing(Snack::getAmount));
    }

    public List<Snack> getSnacks() {
        System.out.println("\nCurrent SnackMachine");
        for (Snack snack : this.snacks) {
            System.out.println("Code: "+snack.getCode()+" snackName: "+snack.getName()+" snackCost: "+snack.getCost()+"$ currentAmount: "+snack.getAmount());
        }
        System.out.println("\n");
        return this.snacks;
    }
}
