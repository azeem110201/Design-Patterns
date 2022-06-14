package com.azeem.flyweight;

public class Main {
    public static void main(String[] args) {
        Vehicle cycle = VehicleFactory.getVehicle("cycle");
        cycle.assignColor("blue");
        cycle.startEngine();

        cycle.assignColor("black");
        cycle.startEngine();

//        Vehicle car = VehicleFactory.getVehicle("car");

        Vehicle truck = VehicleFactory.getVehicle("truck");
        truck.assignColor("blue");
        truck.startEngine();

        truck.assignColor("black");
        truck.startEngine();
    }
}
