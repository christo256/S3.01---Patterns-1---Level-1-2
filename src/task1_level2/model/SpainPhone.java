package task1_level2.model;

public class SpainPhone implements PhoneNumber {
    private final String number;

    public SpainPhone(String number) {
        this.number = number;
    }

    @Override
    public String getFullNumber() {
        return "+34 " + number;
    }
}