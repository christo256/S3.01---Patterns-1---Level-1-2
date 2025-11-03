package task1_level2.menu;

import task1_level2.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private final List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void showContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in the agenda.");
            return;
        }
        System.out.println("=== Contact List ===");
        for (Contact c : contacts) {
            System.out.println(c.showContact());
            System.out.println("-------------------");
        }
    }
}