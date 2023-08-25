package com.practice.designpatterns.factory.validators;

import com.practice.designpatterns.factory.models.Address;
import com.practice.designpatterns.factory.validators.AddressValidator;

public class GermanyAddressValidator implements AddressValidator {
    @Override
    public boolean validate(Address address) {
        System.out.println("Germany validator called");
        return true;
    }
}
