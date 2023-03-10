package com.andresVelez.rectangle.app;

import com.andresVelez.rectangle.domain.Rectangle;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectanguloUno = new Rectangle("Rectangulo1",-5,30);

        rectanguloUno.greet();
        rectanguloUno.countDiagonals();
        rectanguloUno.measureDiagonal();
        rectanguloUno.measurePerimeter();
        rectanguloUno.measureArea();

    }

}
