package task1_level2.menu;

import task1_level2.factory.ContactFactory;
import task1_level2.factory.FranceFactory;
import task1_level2.factory.SpainFactory;
import task1_level2.model.Contact;

import java.util.Scanner;

public class ContactMenu {
    private final AddressBook addressBook;
    private final Scanner scanner;

    public ContactMenu() {
        this.addressBook = new AddressBook();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            printMenu();
            int option = getUserOption();

            switch (option) {
                case 1 -> addContact(new SpainFactory(), "Spain");
                case 2 -> addContact(new FranceFactory(), "France");
                case 3 -> addressBook.showContacts();
                case 4 -> {
                    running = false;
                    System.out.println("Exiting program...");
                }
                default -> System.out.println("Invalid option, try again.");
            }
        }

        scanner.close();
    }

    private void printMenu() {
        System.out.println("\n=== Contact Agenda ===");
        System.out.println("1. Add contact (Spain)");
        System.out.println("2. Add contact (France)");
        System.out.println("3. Show all contacts");
        System.out.println("4. Exit");
        System.out.print("Option: ");
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

    private void addContact(ContactFactory factory, String country) {
        System.out.println("Adding contact for " + country);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter street: ");
        String street = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        Contact contact = new Contact(name,
                factory.createAddress(street, city),
                factory.createPhoneNumber(phone));
        addressBook.addContact(contact);
    }
}
