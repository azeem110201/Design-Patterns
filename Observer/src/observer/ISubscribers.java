package observer;

public interface ISubscribers {
    void update();
    String getSubscriberName();
    void subscribeChannel(IChannel channel);
}
