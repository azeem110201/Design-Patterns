package com.azeem.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();

        circle.X = 10;
        circle.Y = 10;
        circle.radius = 20;

        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        anotherCircle.Y = 20;
        shapes.add(anotherCircle);

        for (Shape c: shapes) {
            System.out.println(c);
            System.out.println(c.X);
            System.out.println(c.Y);
        }

//        Circle anotherCircle = circle;
//
//        System.out.println(circle + "----" + anotherCircle);
    }
}
