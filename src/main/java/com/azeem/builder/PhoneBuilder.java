package com.azeem.builder;

public class PhoneBuilder {
    private int ramSize;
    private int MAHBattery;
    private int simSlots;
    private String processor;
    private String os;

    public PhoneBuilder setRamSize(int ramSize) {
        this.ramSize = ramSize;
        return this;
    }

    public PhoneBuilder setMAHBattery(int MAHBattery) {
        this.MAHBattery = MAHBattery;
        return this;
    }

    public PhoneBuilder setSimSlots(int simSlots) {
        this.simSlots = simSlots;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public Phone getPhone(){
        return new Phone(ramSize, MAHBattery, simSlots, processor, os);
    }
}
