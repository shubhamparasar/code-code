package com.practice.designpatterns.observer;

public class MsgSender implements OrderSubscriber{

    Flipkart flipkart = Flipkart.getInstance();

    public MsgSender(){
        flipkart.setOrderSubscriberList(this);
    }
    @Override
    public void doSomething() {
        System.out.println("in the MsgSender class");
    }
}
