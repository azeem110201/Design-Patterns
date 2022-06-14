package com.azeem.flyweight;

public class Truck implements Vehicle{
    private final int maxSpeed;
    private String color;
    Truck(){
        this.maxSpeed = 180;
    }
    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine of truck with a color " + this.color);
    }
}
