package bridge;

public class NewRemote implements Remote{
    @Override
    public void on() {
        System.out.println("ON with new remote");
    }

    @Override
    public void off() {
        System.out.println("OFF with new remote");
    }
}
