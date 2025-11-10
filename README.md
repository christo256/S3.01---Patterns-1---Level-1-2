# 📚 Java Design Patterns - Level 1 & Level 2

## 📄 Description

This repository contains Java exercises that demonstrate the implementation of **Design Patterns** in two levels:

- 🛠️ **Level 1**: Singleton Pattern - Implementing an "Undo" command feature.
- 🧱 **Level 2**: Abstract Factory Pattern - Building a small international address and phone number manager.

Each project includes:
- Code implementing design patterns
- Example usage with a `Main` class to demonstrate functionality
- Instructions to compile and run the projects

---

## 🧩 Level 1 - Singleton Pattern

### 🛠️ Exercise 1 - Undo Command System

This exercise demonstrates the **Singleton pattern** by creating an "Undo" system that tracks commands.

#### Requirements:
- The `Undo` class stores the last entered commands.
- Allows adding, removing, and listing commands (similar to the 'history' command in Linux).
- Implements the **Singleton** pattern to ensure only one instance of the `Undo` class is used.

#### Main features:
- Add a new command to the history
- Undo the last command
- List all previous commands

#### Files:
- **CommandMenu.java**: Handles the user interface and interactions.
- **Undo.java**: Singleton class that manages command history.
- **MenuPrinter.java**: Utility class for printing the menu and messages.

### Example usage:
```java
public class Main {
    public static void main(String[] args) {
        CommandMenu menu = new CommandMenu();
        menu.start();
    }
}
```
--- 
## 🧩 Level 2 - Abstract Factory Pattern
### 📚 Exercise 2 - International Contact Manager

This exercise demonstrates the Abstract Factory pattern by creating a contact manager for different countries. It allows adding international addresses and phone numbers, considering the specific formats for each country.

#### Requirements:

- Implement different factories for each country (Spain, France).

- Each factory will create the respective Address and PhoneNumber objects based on country-specific formats.

#### Main features:

Add contacts with addresses and phone numbers from Spain and France.

Show all contacts in the agenda.

The address and phone number format differ depending on the country.

#### Files:

- **ContactMenu.java**: Main class for managing the contact agenda.

- **AddressBook.java**: Manages and displays the list of contacts.

- **ContactFactory.java**: Interface defining the factory methods.

- **SpainFactory.java** / **FranceFactory.java**: Concrete factories for creating Spanish and French contacts.

### Example usage:
```java
public class Main {
    public static void main(String[] args) {
        var menu = new ContactMenu();
        menu.start();
    }
}
```
---
## 💻 Technologies Used
· Java 21+
· Design Patterns: Singleton, Abstract Factory
· Git & GitHub for version control
· IDE: IntelliJ IDEA

## 📋 Requirements

· JDK 11 or higher

· A Java IDE (such as IntelliJ IDEA or Eclipse)

· Basic knowledge of design patterns (Singleton and Abstract Factory)

· Basic Java knowledge (OOP, classes, interfaces, etc.)

---
## 🛠️ Installation

1. **Clone the repository:**

```bash
https://github.com/christo256/S3.01---Patterns-1---Level-1-2
