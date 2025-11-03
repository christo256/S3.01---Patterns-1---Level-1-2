package task1_level2.factory;

import task1_level2.model.Address;
import task1_level2.model.PhoneNumber;
import task1_level2.model.SpainAddress;
import task1_level2.model.SpainPhone;

public class SpainFactory implements ContactFactory {

    @Override
    public Address createAddress(String street, String city) {
        return new SpainAddress(street, city);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new SpainPhone(number);
    }
}
