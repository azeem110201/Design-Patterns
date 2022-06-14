package com.azeem.builder;

public class Main {
    public static void main(String[] args) {
        //        Phone newPhone = new Phone(
//                16, 8000, 2, "Qualcomm Snapdragon 865", "Android"
//        );

        Phone newPhone = new PhoneBuilder().setRamSize(16).setMAHBattery(8000).getPhone();

        System.out.println(newPhone);
    }
}
