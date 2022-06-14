package strategy;

public class NoRefill implements Refilleable{
    @Override
    public void refill() {
        System.out.println("NO refilling has to be done");
    }
}
