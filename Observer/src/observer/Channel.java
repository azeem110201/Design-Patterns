package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel {
    private List<ISubscribers> subscribers = new ArrayList<>();
    private String title;

    @Override
    public void subscribeChannel(ISubscribers subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getSubscriberName() + " has subscribed your channel");
    }

    public void unSubscribeChannel(ISubscribers subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getSubscriberName() + " has unsubscribed your channel");
    }

    public void notifySubscribers(){
        for(ISubscribers subscriber: subscribers){
            subscriber.update();
            System.out.println("Hi " + subscriber.getSubscriberName() + " " + title + " has uploaded video on the channel");
        }
    }

    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }
}
