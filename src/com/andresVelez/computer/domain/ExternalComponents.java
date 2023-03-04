package com.andresVelez.computer.domain;

public class ExternalComponents {
    public String monitor;
    public String keyBoard;
    public String mouse;
    public boolean printer;
    public boolean headPhones;
    public boolean wedCam;
    public boolean buttonOnOff;
    public String user;

    public ExternalComponents(String user, boolean buttonOnOff) {
        this.user = user;
        this.buttonOnOff = buttonOnOff;
    }

    public boolean clipButtonOnOff(boolean onOFF){
        if (onOFF==true){
            System.out.println("On Screen!..");
            this.monitor = "On Screen";
            return true;
        }
        System.out.println("Off Screen!..");
        return false;
    }
    public boolean lonInOut(String yourName){
        if (this.monitor == "On Screen"){
            System.out.println("Lon In Exitoso!!");
            System.out.println("Hi : "+yourName+" Welcome");
            return true;
        }
        System.out.println("The Screen is not ON !!......");
        return false;
    }
    public void playMusic(){
        if (this.monitor == "On Screen"){
            System.out.println("Play Music !!");
            System.out.println("papamericano ta ta taaaa papamericano ta ta taaa ♩♪♫♬♬♬");
        }else {
            System.out.println("The Screen is not ON !!......");
        }
    }
    public void activateCam(){
        if (this.monitor == "On Screen"){
            System.out.println("Activate Cam !!");
            System.out.println("Taking a picture ! say Whisky.....");
        }else {
            System.out.println("The Screen is not ON !!......");
        }
    }
}



