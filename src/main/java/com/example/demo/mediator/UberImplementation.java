package com.example.demo.mediator;

public class UberImplementation implements Uber{
    private Booking booking;

    private Passenger passenger;

    public boolean available;

    @Override
    public void registerBooking(Booking booking) {
        this.booking = booking;
    }

    @Override
    public void registerPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public void setAvailability(boolean status) {
        this.available = status;
    }

    @Override
    public boolean isAvailable() {
        return this.available;
    }
}
