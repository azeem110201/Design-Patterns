package observer;

public interface IChannel {
    void subscribeChannel(ISubscribers subscriber);
    void unSubscribeChannel(ISubscribers subscriber);
    void notifySubscribers();
    void upload(String title);
}
