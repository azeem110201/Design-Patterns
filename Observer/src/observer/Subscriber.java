package observer;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    Subscriber(String name){
        this.name = name;
    }

    public void update() {
        System.out.println("Video uploaded");
    }

    public String getSubscriberName(){
        return this.name;
    }

    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
}
