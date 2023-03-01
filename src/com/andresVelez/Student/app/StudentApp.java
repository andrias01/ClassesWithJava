package com.andresVelez.Student.app;

import com.andresVelez.Student.domain.Student;
import com.andresVelez.bicycle.domain.Bicycle;

public class StudentApp {
    public static void main(String[] args) {
        Student theStudent = new Student();
        theStudent.name = "Andres";
        theStudent.age = 26;
        String person1 = "someone";
        String person2 = "somewhere";
        theStudent.greet(theStudent.name, theStudent.age, person2);


    }
}
