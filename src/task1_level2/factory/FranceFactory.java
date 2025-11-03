package task1_level2.factory;

import task1_level2.model.Address;
import task1_level2.model.FRAddress;
import task1_level2.model.FRPhone;
import task1_level2.model.PhoneNumber;

public class FranceFactory implements ContactFactory {

    @Override
    public Address createAddress(String street, String city) {
        return new FRAddress(street,city);
    }

    @Override
    public PhoneNumber createPhoneNumber(String number) {
        return new FRPhone(number);
    }
}
