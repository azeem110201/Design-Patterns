package singleton;

public class Main extends Thread{
    public void run(){
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj2.hashCode());
    }
    public static void main(String[] args) {

        Main mainThread = new Main();

        mainThread.start();

        Singleton obj1 = Singleton.getInstance();

        System.out.println(obj1.hashCode());

    }
}
