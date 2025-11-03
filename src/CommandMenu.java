import java.util.Scanner;

public class CommandMenu {
    private final Undo undo;
    private final Scanner scanner;
    private final MenuPrinter printer;

    public CommandMenu() {
        this.undo = Undo.getInstance();
        this.scanner = new Scanner(System.in);
        this.printer = new MenuPrinter();
    }

    public void start() {
        boolean running = true;

        printer.printerHeader();

        while (running) {
            printer.printMenu();
            int option = getUserOption();
            {

                switch (option) {
                    case 1 -> {
                        System.out.println("Enter the command to add: ");
                        String command = scanner.nextLine();
                        try {
                            undo.addCommand(command);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 2 -> undo.undoLastCommand();
                    case 3 -> undo.listCommands();
                    case 4 -> {
                        running = false;
                        printer.printExitMessage();
                    }
                    default -> printer.printInvalidOption();
                }
            }
        }
    }

    private int getUserOption() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a number: ");
            scanner.next();
        }
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}



