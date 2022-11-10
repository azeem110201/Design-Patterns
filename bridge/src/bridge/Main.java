package bridge;

public class Main {
    public static void main(String[] args) {
        TV sonyOldRemote = new SonyTV(new OldRemote());
        sonyOldRemote.on();
        sonyOldRemote.off();
        System.out.println();

        TV sonyNewRemote = new SonyTV(new NewRemote());
        sonyNewRemote.on();
        sonyNewRemote.off();
        System.out.println();

        TV philipsOldRemote = new PhilipsTV(new OldRemote());
        philipsOldRemote.on();
        philipsOldRemote.off();
        System.out.println();

        TV philipsNewRemote = new PhilipsTV(new NewRemote());
        philipsNewRemote.on();
        philipsNewRemote.off();
        System.out.println();
    }
}
