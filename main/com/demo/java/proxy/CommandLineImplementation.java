package proxy;

public class CommandLineImplementation implements CommandLine{
    @Override
    public void executeCommand(String command) {
        System.out.println(command + " is executed..");
    }
}
