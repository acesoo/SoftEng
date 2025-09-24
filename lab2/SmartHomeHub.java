package lab2;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeHub {
    private Map<String, Command> commands = new HashMap<>();

    public void setCommand(String commandName, Command command) {
        commands.put(commandName, command);
    }

    public void executeCommand(String commandName) {
        Command command = commands.get(commandName);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Command not found: " + commandName);
        }
    }

    public void undoCommand(String commandName) {
        Command command = commands.get(commandName);
        if (command != null) {
            command.undo();
        } else {
            System.out.println("Command not found: " + commandName);
        }
    }
}