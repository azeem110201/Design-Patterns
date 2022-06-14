package com.azeem.flyweight;

import java.util.HashMap;

public class VehicleFactory {
    private static HashMap<String, Vehicle> vehicleHashMap = new HashMap<>();

    public static Vehicle getVehicle(String type) {
        Vehicle v = null;

        if (vehicleHashMap.containsKey(type)) {
            v = vehicleHashMap.get(type);
        } else {
            switch (type) {
                case "cycle":
                    System.out.println("Cycle object created");
                    v = new Cycle();
                    break;
                case "truck":
                    System.out.println("truck object created");
                    v = new Truck();
                    break;
                default:
                    throw new IllegalArgumentException("Illegal argument passed");
            }
            vehicleHashMap.put(type, v);
        }

        return v;
    }
}
