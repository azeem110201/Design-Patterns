package proxy;

public class CommandLineProxy implements CommandLine{

    private CommandLine commandLine;
    private boolean isAdmin;

    public CommandLineProxy(String name, String password){
        if(name.equals("azeem") && password.equals("test123")) {
            isAdmin = true;
        }
        commandLine = new CommandLineImplementation();

    }
    @Override
    public void executeCommand(String command) {
        if(isAdmin){
            commandLine.executeCommand(command);
        }

        else{
            if(command.startsWith("sudo") || command.startsWith("rm") || command.startsWith("mkdir") || command.startsWith("mv") || command.startsWith("cp")){
                System.out.println("No Create/Update/Delete Operation can be performed if you are not a root user");
            }
            else{
                commandLine.executeCommand(command);
            }
        }

    }
}
