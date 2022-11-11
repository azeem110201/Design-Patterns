package observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements ISubscribers
{
    private String name;
    private List<IChannel> channels = new ArrayList<>();

    Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Video uploaded");
    }

    @Override
    public String getSubscriberName(){
        return this.name;
    }
    @Override
    public void subscribeChannel(IChannel channel) {
        this.channels.add(channel);
    }
}
