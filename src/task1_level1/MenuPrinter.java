package task1_level1;

public class MenuPrinter {

    public void printerHeader() {
        System.out.println("=== task1_level1.Undo Command Exercise ===");
    }

    public void printMenu() {
        System.out.println("\nChoose an option: ");
        System.out.println("1. Add command");
        System.out.println("2. Remove last command");
        System.out.println("3. Show command history");
        System.out.println("4. Exit");
        System.out.print("Option: ");
    }

    public void printInvalidOption() {
        System.out.println("Invalid option. Try again.");
    }

    public void printExitMessage() {
        System.out.println("Exiting program...");

    }
}
