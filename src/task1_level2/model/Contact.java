package task1_level2.model;

public class Contact {
    private final String name;
    private final Address address;
    private final PhoneNumber phoneNumber;

    public Contact(String name, Address address, PhoneNumber phoneNumber) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        if (phoneNumber == null) {
            throw new IllegalArgumentException("Phone number cannot be null");
        }

        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public String showContact() {
        return name + "\n" +
                "Address: " + address.getFullAddress() + "\n" +
                "Phone: " + phoneNumber.getFullNumber();
    }
}

