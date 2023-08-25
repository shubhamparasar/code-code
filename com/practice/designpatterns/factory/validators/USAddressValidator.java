package com.practice.designpatterns.factory.validators;

import com.practice.designpatterns.factory.models.Address;
import com.practice.designpatterns.factory.validators.AddressValidator;

public class USAddressValidator implements AddressValidator {
    @Override
    public boolean validate(Address address) {
        System.out.println("USA validator called");
        return true;
    }
}
