package com.andresVelez.Student.domain;

public class Student {
    public String name;
    public byte age;
    public String level;
    public byte schoolYear;
    public String schoolYearType;
    public double performance;

    public boolean goodBehevior;
    public boolean badBehevior;

    //greet someone o somewhere
    public void greet(String name,byte age,String oneOrMorePersons){
        if (oneOrMorePersons == "someone"){
            System.out.println("Hola mi nombre es "+ this.name + " ,tengo " + this.age + " años y me gusta estudiar mucho un gusto conocerte!");
        }else {
            System.out.println("Hola mi nombre es "+ this.name + " ,tengo " + this.age + " años y me gusta estudiar mucho un gusto conocerlos!");
        }

    }
    public boolean winTheCurse(){
        if (this.performance >= 5.0){
            System.out.println("Hola " + this.name + "! Felicidades Ganastes el curso, tu nota final es un "+ this.performance+" ...");
            return true;
        }
        System.out.println("Hola " + this.name + "! Perdiste el curso, vuelve a intentarlo,  tu nota final es un "+ this.performance+" ...");
        return false;
    }
    public void behaviorNote(double note){this.performance+=note;}

    public String getCurrentNote() {return "The current Note is " + this.performance;}
}
