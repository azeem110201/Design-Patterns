package observer;

public class Main {
    public static void main(String[] args) {
        IChannel channel = new Channel();

        ISubscribers subscriber_1 = new Subscriber("ABC");
        ISubscribers subscriber_2 = new Subscriber("XYZ");
        ISubscribers subscriber_3 = new Subscriber("QWERTY");
        ISubscribers subscriber_4 = new Subscriber("JOHN");
        ISubscribers subscriber_5 = new Subscriber("MARRY");


        channel.subscribeChannel(subscriber_1);
        channel.subscribeChannel(subscriber_2);
        channel.subscribeChannel(subscriber_3);
        channel.subscribeChannel(subscriber_4);
        channel.subscribeChannel(subscriber_5);

        subscriber_1.subscribeChannel(channel);
        subscriber_2.subscribeChannel(channel);
        subscriber_3.subscribeChannel(channel);
        subscriber_4.subscribeChannel(channel);
        subscriber_5.subscribeChannel(channel);

        channel.upload("How to Learning Programming");
    }
}
