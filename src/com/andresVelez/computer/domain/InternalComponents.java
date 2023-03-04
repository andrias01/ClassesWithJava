package com.andresVelez.computer.domain;

import java.text.StringCharacterIterator;

public class InternalComponents {
    public String videoCard;
    public String processor;
    public String ramMemory;
    public String hardDisk;
    public String PowerSupply;
    public String motherBoard;
    public Computer typeComputer;

    public InternalComponents(Computer typeComputer,String processor, String ramMemory, String hardDisk) {
        this.typeComputer = typeComputer;
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
    }

    public void specifyComponents(){
        System.out.println("*****************************************************");
        System.out.println("The type of computer is: "+ this.typeComputer.brand);
        System.out.println("Serial is : "+ this.typeComputer.serial);
        System.out.println("The type of processor is: "+ this.processor);
        System.out.println("The amount of RAM is: "+ this.ramMemory);
        System.out.println("The capacity on the hardDrive is: "+ this.hardDisk);
    }
}
