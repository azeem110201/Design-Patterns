package strategy;

public class InternalRepairs implements Repairable{
    @Override
    public void repair() {
        System.out.println("Doing some internal repair stuff.... :-)");
    }
}
