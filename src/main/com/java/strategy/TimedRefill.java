package strategy;

public class TimedRefill implements Refilleable{
    @Override
    public void refill() {
        System.out.println("Timely-Refill work in progress...");
    }
}
