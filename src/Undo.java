import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private List<String> commands;

    private Undo() {
        commands = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        if (command.isEmpty() || command.isBlank()) {
            throw new IllegalArgumentException("The command can not be empty.");
        }
        commands.add(command);
        System.out.println("Command added: " + command);
    }

    public void undoLastCommand() {
        if (commands.isEmpty()) {
            System.out.println("No commands to undo");
        } else {
            String undo = commands.remove(commands.size() - 1);
            System.out.println("Removed last command: " + undo);
        }
    }

    public void listCommands() {
        if (commands.isEmpty()) {
            System.out.println("No commands in history.");
        } else {
            System.out.println("Command history: ");
            for (String cmd : commands) {
                System.out.println("- " + cmd);
            }
        }
    }
}
