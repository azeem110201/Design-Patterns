package com.example.demo.mediator;

public interface Uber {
    void registerBooking(Booking booking);
    void registerPassenger(Passenger passenger);
    void setAvailability(boolean status);
    boolean isAvailable();
}
