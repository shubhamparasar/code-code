package com.practice.designpatterns.adapter;

public class SbiBankApi {
    public Integer getBalance() {
        System.out.println("in the Sbi Bank, balance is : "+100);
        return null;
    }

    public boolean sendMoney() {
        System.out.println("in the Sbi Bank, money sent successfully");
        return true;
    }
}
