package com.example.demo.mediator;

public class Passenger implements Command{
    private Uber mediator;

    Passenger(Uber mediator){
        this.mediator = mediator;
    }
    @Override
    public void bookARide() {
        if(mediator.isAvailable()){
            System.out.println("You can book a ride");
            mediator.setAvailability(false);
        }
        else{
            System.out.println("Driver is occupied.");
        }
    }

    public void confirmedRideMessage(){
        System.out.println("You have booked a ride");
    }

    public void completeRideMessage(){
        System.out.println("Your destination has been reached...");
        mediator.setAvailability(true);
    }
}
