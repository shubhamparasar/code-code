package com.practice.designpatterns.adapter;

public class PhonePe {

    PhonePeBankApi phonePeBankApi;
    public PhonePe(PhonePeBankApi phonePeBankApi){
        this.phonePeBankApi=phonePeBankApi;
    }

    public void doSomething(){
        phonePeBankApi.sendMoney();
        phonePeBankApi.getBalance();
    }
}
