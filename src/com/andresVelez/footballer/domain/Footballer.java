package com.andresVelez.footballer.domain;

public class Footballer {
    public String name;
    public int age;
    public String uniformColor;
    public String team;
    public int physicalState = 100;
    public Plays plays;
    public int distanceToArchery = 100;

    public Footballer(String name, int age, String uniformColor, String team) {
        this.name = name;
        this.age = age;
        this.uniformColor = uniformColor;
        this.team = team;
    }

    public void getTired(){
        if (this.physicalState >= 10){
            this.physicalState -= 10 ;
        }else {
            System.out.println(this.name+ ": ya no puede mas...");
        }
    }
    public void makeGoal(){
        if (this.distanceToArchery <= 15 && this.physicalState >= 30){
            System.out.println("GOOOOOOLLLLL que golazo de "+ this.name + " Felicidades");
        }else {
            if (this.physicalState < 30){
                System.out.println(this.name+ " estas muy cansado para hacer un GOAL");
            }else System.out.println("Acercate mas al arco aun esta muy lejos ......");

        }
    }
    public void getCloserToArcery(int distance){
        if(this.distanceToArchery <= 0){
            System.out.println(this.name+ " Ya no te puedes acercar mas al Arco");
        }else distanceToArchery -= distance;
    }
    public String getCurrentDistanceToArchery() {
        return "** "+this.name+" The current DistanceToArchery is " + this.distanceToArchery+ " Metros" ;
    }
    public String getCurrentPhysicalState() {
        return "** "+this.name+" The current Physical State is " + this.physicalState+ " %";
    }

}
