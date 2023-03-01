package com.andresVelez.Student.domain;

public class Student {
    public String name;
    public byte age;
    public String level;
    public byte schoolYear;
    public String schoolYearType;
    public String performance;
    public boolean goodBehevior;
    public boolean badBehevior;

    //greet someone o somewhere
    public void greet(String name,byte age,String oneOrMorePersons){
        if (oneOrMorePersons == "someone"){
            System.out.println("Hola mi nombre es "+ name + " ,tengo " + age + " años y me gusta estudiar mucho un gusto conocerte!");
        }else {
            System.out.println("Hola mi nombre es "+ name + " ,tengo " + age + " años y me gusta estudiar mucho un gusto conocerlos!");
        }

    }
}
