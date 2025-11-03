package task1_level2.model;

public class FRPhone implements PhoneNumber {
    private final String number;

    public FRPhone(String number) {
        this.number = number;
    }

    @Override
    public String getFullNumber() {
        return "+33 " + number;
    }
}