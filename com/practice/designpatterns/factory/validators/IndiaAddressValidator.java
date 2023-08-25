package com.practice.designpatterns.factory.validators;

import com.practice.designpatterns.factory.models.Address;
import com.practice.designpatterns.factory.validators.AddressValidator;

public class IndiaAddressValidator implements AddressValidator {

    public boolean validate(Address address){
            System.out.println("India validator called");
            return true;
    }


}
