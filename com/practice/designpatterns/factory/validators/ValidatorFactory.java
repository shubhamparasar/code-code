package com.practice.designpatterns.factory.validators;

import com.practice.designpatterns.factory.models.Country;

import java.util.HashMap;
import java.util.Map;

public class ValidatorFactory {

    private static final Map<String, AddressValidator> addressMap = new HashMap<>();

    private static ValidatorFactory validatorFactory = null;
    private ValidatorFactory() {
        addressMap.put(Country.India,new IndiaAddressValidator());
        addressMap.put(Country.USA, new USAddressValidator());
        addressMap.put(Country.Germany,new GermanyAddressValidator());

    }

    public static ValidatorFactory getInstance(){
        if (validatorFactory==null){
            validatorFactory = new ValidatorFactory();
        }
        return validatorFactory;
    }
    public AddressValidator getValidator(String countryName){
        return addressMap.get(countryName);
    }

}
