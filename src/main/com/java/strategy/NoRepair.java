package strategy;

public class NoRepair implements Repairable{
    @Override
    public void repair() {
        System.out.println("No need of any repairing stuff  :-)");
    }
}
