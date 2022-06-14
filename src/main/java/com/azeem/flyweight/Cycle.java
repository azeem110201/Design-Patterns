package com.azeem.flyweight;

public class Cycle implements Vehicle{
    private final int maxSpeed;  // intrinsic property
    private String color;  // extrinsic property (set by user)

    Cycle(){
        maxSpeed = 60;
    }


    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting cycle with color " + this.color);
    }
}
