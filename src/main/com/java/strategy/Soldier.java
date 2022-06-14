package strategy;

public class Soldier {
    public void attack(){
        System.out.println("Attacking the opponent...");
    }

    public void refill(Refilleable refilleable){
        refilleable.refill();
    }

    public void repairable(Repairable repairable){
        repairable.repair();
    }
}
