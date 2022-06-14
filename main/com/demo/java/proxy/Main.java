package proxy;

public class Main {
    public static void main(String[] args) {
        CommandLineProxy commandLineProxy = new CommandLineProxy("azeem", "test123");
        commandLineProxy.executeCommand("sudo rm -rf");

        CommandLineProxy commandLineProxy2 = new CommandLineProxy("john", "qazwsxedc");
        commandLineProxy2.executeCommand("sudo rm -rf");
        commandLineProxy2.executeCommand("ls");
    }
}
