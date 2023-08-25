package com.practice.designpatterns.factory.validators;

import com.practice.designpatterns.factory.models.Address;

public interface AddressValidator {

    boolean validate(Address address);
}
