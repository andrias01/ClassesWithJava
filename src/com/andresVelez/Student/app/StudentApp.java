package com.andresVelez.Student.app;

import com.andresVelez.Student.domain.Student;
import com.andresVelez.bicycle.domain.Bicycle;

public class StudentApp {
    public static void main(String[] args) {
        Student theStudent = new Student("Andres", (byte) 26);

        String person1 = "someone";
        String person2 = "somewhere";
        theStudent.greet(theStudent.name, theStudent.age, person2);
        theStudent.behaviorNote(1);
        System.out.println(theStudent.getCurrentNote());
        theStudent.behaviorNote(2.5);
        System.out.println(theStudent.getCurrentNote());
        theStudent.winTheCurse();
        theStudent.behaviorNote(-3);
        System.out.println(theStudent.getCurrentNote());
        theStudent.behaviorNote(2);
        System.out.println(theStudent.getCurrentNote());
        theStudent.behaviorNote(2.5);
        System.out.println(theStudent.getCurrentNote());
        theStudent.winTheCurse();




    }
}
