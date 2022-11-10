package bridge;

public class OldRemote implements Remote{
    @Override
    public void on() {
        System.out.println("ON with old remote");
    }

    @Override
    public void off() {
        System.out.println("OFF with old remote");
    }
}
