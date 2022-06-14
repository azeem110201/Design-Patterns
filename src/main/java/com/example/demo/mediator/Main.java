package com.example.demo.mediator;

public class Main {
    public static void main(String[] args) {
        Uber mediator = new UberImplementation();

        Booking booking = new Booking(mediator);
        Passenger passenger = new Passenger(mediator);
//        Passenger passenger1 = new Passenger(mediator);

        mediator.registerBooking(booking);
        mediator.registerPassenger(passenger);

        booking.bookARide();
        passenger.bookARide();
//        passenger1.bookARide();
        passenger.confirmedRideMessage();
        passenger.completeRideMessage();
    }
}
