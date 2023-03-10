package com.andresVelez.footballer.app;

import com.andresVelez.footballer.domain.Footballer;
import com.andresVelez.footballer.domain.Plays;

public class FootballerApp {
    public static void main(String[] args) {
        Plays play = new Plays();
        //The player has 5 plays
        Footballer andresVelez = new Footballer("Andres Velez",26,"Amarillo","Colombia");
        System.out.println(andresVelez.getCurrentDistanceToArchery());
        andresVelez.getCloserToArcery(60);
        System.out.println(andresVelez.getCurrentDistanceToArchery());
        andresVelez.getTired();
        System.out.println(andresVelez.getCurrentPhysicalState());
        play.makePlays(1);
        andresVelez.makeGoal();
        andresVelez.getCloserToArcery(20);
        System.out.println(andresVelez.getCurrentDistanceToArchery());
        play.makePlays(2);
        andresVelez.getTired();
        andresVelez.getTired();
        System.out.println(andresVelez.getCurrentPhysicalState());
        andresVelez.getTired();
        play.makePlays(4);
        andresVelez.getTired();
        andresVelez.getTired();
        System.out.println(andresVelez.getCurrentPhysicalState());
        play.makePlays(3);
        andresVelez.makeGoal();
        //andresVelez.getTired();
        andresVelez.getTired();
        System.out.println(andresVelez.getCurrentPhysicalState());
        andresVelez.getCloserToArcery(6);
        System.out.println(andresVelez.getCurrentDistanceToArchery());
        andresVelez.makeGoal();


    }
}
