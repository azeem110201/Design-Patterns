package bridge;

public class SonyTV extends TV{
    Remote remoteType;

    SonyTV(Remote remote){
        super(remote);
        this.remoteType = remote;
    }
    @Override
    void on() {
        System.out.println("Sony TV On...");
        this.remoteType.on();
    }

    @Override
    void off() {
        this.remoteType.off();
    }
}
