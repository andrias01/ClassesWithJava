package com.andresVelez.footballer.domain;

public class Plays {
    public int type;

    public void makePlays(int plays){
        switch (plays){
            case 1:
                System.out.println("\n**Hace una jugada de GIRO DE CRUYFF ");
                System.out.println("Simula que va a chutar y engancha por detras!!! ");
                break;
            case 2:
                System.out.println("\n**Hace una jugada de LA TIJERA DOBLE ");
                System.out.println("Mete una pierna luego la otra y cambia de dirección ");
                break;
            case 3:
                System.out.println("\n**Hace una jugada de ELASTICO ");
                System.out.println("Se tira el balón al lado y luego se estira el pie para cambiarle la dirección ");
            case 4:
                System.out.println("\n**Hace una jugada de EL MARADONA ");
                System.out.println("Se le da la espalda al oponente y se gira completamente hasta seguir con el balón");
                break;
            case 5:
                System.out.println("\n**Hace una jugada de LA BICICLETA ");
                System.out.println("Se enreda el balón entre los pies y con el talón golpearlo por detras,");
                System.out.println("logrando que el balón pase por encima de los dos. \n");
                break;
        }
    }
}
