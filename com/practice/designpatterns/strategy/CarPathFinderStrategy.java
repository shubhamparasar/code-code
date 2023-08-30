package com.practice.designpatterns.strategy;

public class CarPathFinderStrategy implements PathFinderStrategy{
    @Override
    public void findPath(String Source, String Destination) {
        System.out.println("in the car path finder class");
    }
}
