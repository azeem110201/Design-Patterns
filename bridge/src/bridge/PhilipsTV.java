package bridge;

public class PhilipsTV extends TV{

    Remote remoteType;

    PhilipsTV(Remote remote){
        super(remote);
        this.remoteType = remote;
    }
    @Override
    void on() {
        System.out.println("Philips TV On...");
        this.remoteType.on();
    }

    @Override
    void off() {
        System.out.println("Philips TV Off...");
        this.remoteType.off();
    }
}
