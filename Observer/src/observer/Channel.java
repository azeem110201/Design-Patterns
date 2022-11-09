package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String title;

    public void subscribeChannel(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getSubscriberName() + " has subscribed your channel");
    }

    public void unSubscribeChannel(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getSubscriberName() + " has unsubscribed your channel");
    }

    public void notifySubscribers(){
        for(Subscriber subscriber: subscribers){
            subscriber.update();
            System.out.println("Hi " + subscriber.getSubscriberName() + " " + title + " has uploaded video on the channel");
        }
    }

    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }
}
