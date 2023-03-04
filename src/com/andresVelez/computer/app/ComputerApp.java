package com.andresVelez.computer.app;


import com.andresVelez.computer.domain.Computer;
import com.andresVelez.computer.domain.ExternalComponents;
import com.andresVelez.computer.domain.InternalComponents;

public class ComputerApp {
    public static void main(String[] args) {

        Computer gamer = new Computer("SAMSUNG",123,"GAMER");
        Computer office = new Computer("ASUS",321,"OFFICE");
        InternalComponents gamerPC = new InternalComponents(gamer,"INTEL","16MB","1000GB");
        InternalComponents officePC = new InternalComponents(office,"AMD","3MB","500GB");

        gamerPC.specifyComponents();

        ExternalComponents UserOne = new ExternalComponents("Andres",true);
        System.out.println(gamer.getCurrentTypePC());
        UserOne.clipButtonOnOff(UserOne.buttonOnOff);
        UserOne.lonInOut(UserOne.user);
        UserOne.playMusic();

        officePC.specifyComponents();

        ExternalComponents UserTwo = new ExternalComponents("Alejandro",true);
        System.out.println(office.getCurrentTypePC());
        UserTwo.clipButtonOnOff(UserTwo.buttonOnOff);
        UserTwo.lonInOut(UserTwo.user);
        UserTwo.activateCam();
    }
}
