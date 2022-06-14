package com.azeem.builder;

public class Phone {
    private int ramSize;
    private int MAHBattery;
    private int simSlots;
    private String processor;
    private String os;

    public Phone(int ramSize, int MAHBattery, int simSlots, String processor, String os) {
        this.ramSize = ramSize;
        this.MAHBattery = MAHBattery;
        this.simSlots = simSlots;
        this.processor = processor;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ramSize=" + ramSize +
                ", MAHBattery=" + MAHBattery +
                ", simSlots=" + simSlots +
                ", processor='" + processor + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
