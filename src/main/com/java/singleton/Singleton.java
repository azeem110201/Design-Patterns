package singleton;

public class Singleton{
    private Singleton() {
    }

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            return instance = new Singleton();
        } else {
            return instance;
        }
    }
}
