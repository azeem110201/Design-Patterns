package com.azeem.prototype;

public abstract class Shape {
    public int X;
    public int Y;
    public String color;

    public Shape(){

    }

    public Shape(Shape source){
        this();
        this.X = source.X;
        this.Y = source.Y;
        this.color = source.color;
    }

    public abstract Shape clone();
}
