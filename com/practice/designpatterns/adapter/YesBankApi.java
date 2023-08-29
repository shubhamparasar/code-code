package com.practice.designpatterns.adapter;

public class YesBankApi {
    public Integer getBalance() {
        System.out.println("in the Yes Bank, balance is : "+100);
        return null;
    }

    public boolean sendMoney() {
        System.out.println("in the Yes Bank, money sent successfully");
        return true;
    }
}
