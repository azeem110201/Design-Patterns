package com.example.demo.mediator;

public class Booking implements Command{
    private Uber mediator;

    Booking(Uber mediator){
        this.mediator = mediator;
    }

    @Override
    public void bookARide() {
        System.out.println("Passenger is available for booking");
        mediator.setAvailability(true);
    }
}
