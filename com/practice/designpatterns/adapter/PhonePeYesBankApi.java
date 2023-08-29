package com.practice.designpatterns.adapter;

public class PhonePeYesBankApi implements PhonePeBankApi{

    YesBankApi yesBankApi = new YesBankApi();
    @Override
    public Integer getBalance() {
        return yesBankApi.getBalance();
    }

    @Override
    public boolean sendMoney() {
        return yesBankApi.sendMoney();
    }
}
