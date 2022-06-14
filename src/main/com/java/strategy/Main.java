package strategy;

public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.attack();

        soldier.repairable(new NoRepair());
        soldier.repairable(new ExternalRepairs());
        soldier.repairable(new InternalRepairs());
    }
}
