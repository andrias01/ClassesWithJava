package com.andresVelez.geometry.app;

import com.andresVelez.geometry.domain.Circle;
import com.andresVelez.geometry.domain.GeometricShape;
import com.andresVelez.geometry.domain.Square;
import com.andresVelez.geometry.domain.Triangle;

import java.util.ArrayList;
import java.util.List;

public class GeometricApp {
    public static void main(String[] args) {
        List<GeometricShape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Triangle(5,6,9));
        shapes.add(new Square(2,5));

        shapes.forEach(shape -> {
            System.out.println("\n" + shape);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        });
    }
}
