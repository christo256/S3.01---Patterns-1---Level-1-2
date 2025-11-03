package task1_level2.factory;

import task1_level2.model.Address;
import task1_level2.model.PhoneNumber;

public interface ContactFactory {
    Address createAddress(String street, String city);

    PhoneNumber createPhoneNumber(String number);
}
