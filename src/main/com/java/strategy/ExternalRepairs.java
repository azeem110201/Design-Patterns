package strategy;

public class ExternalRepairs implements Repairable{
    @Override
    public void repair() {
        System.out.println("Doing some external repairing stuff.... :-(");
    }
}
