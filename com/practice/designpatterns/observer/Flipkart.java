package com.practice.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    List<OrderSubscriber> orderSubscriberList = new ArrayList<>();
    public static Flipkart flipkart = null;
    private Flipkart(){

    }
    public static Flipkart getInstance(){
        if(flipkart==null){
            synchronized (Flipkart.class){
                if(flipkart==null){
                    flipkart = new Flipkart();
                }
            }
        }
        return flipkart;
    }

    public void setOrderSubscriberList(OrderSubscriber orderSubscriber){
        orderSubscriberList.add(orderSubscriber);
    }

    public void postPurchaseActions(){
        for(OrderSubscriber orderSubscriber: orderSubscriberList){
            orderSubscriber.doSomething();
        }
    }
}
