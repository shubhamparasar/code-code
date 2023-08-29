package com.practice.designpatterns.adapter;

public class PhonePeSbiBankApi implements PhonePeBankApi{

    SbiBankApi sbiBankApi = new SbiBankApi();
    @Override
    public Integer getBalance() {
        return sbiBankApi.getBalance();
    }

    @Override
    public boolean sendMoney() {
        return sbiBankApi.sendMoney();
    }
}
