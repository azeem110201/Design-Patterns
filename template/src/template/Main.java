package template;

public class Main {
    public static void main(String[] args) {
        BaseGameLoader wowLoader = new CallOfDuty();
        wowLoader.load();

        System.out.println("******************");

        BaseGameLoader diabloLoader = new PUBG();
        diabloLoader.load();
    }
}
