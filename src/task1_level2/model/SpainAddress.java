package task1_level2.model;

public class SpainAddress implements Address {
    private final String street;
    private final String city;

    public SpainAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }


    @Override
    public String getFullAddress() {
        return street + ", " + city + ", Spain";
    }
}
