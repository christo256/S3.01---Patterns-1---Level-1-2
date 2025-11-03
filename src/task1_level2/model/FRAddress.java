package task1_level2.model;

public class FRAddress implements Address {
    private final String street;
    private final String city;

    public FRAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String getFullAddress() {
        return street + ", " + city + ", France";
    }
}