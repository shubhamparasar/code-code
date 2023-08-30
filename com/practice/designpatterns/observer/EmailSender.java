package com.practice.designpatterns.observer;

public class EmailSender implements OrderSubscriber{

    Flipkart flipkart=flipkart = Flipkart.getInstance();
    public EmailSender(){
        flipkart.setOrderSubscriberList(this);
    }
    @Override
    public void doSomething() {
        System.out.println("in the emailsender class");
    }
}
