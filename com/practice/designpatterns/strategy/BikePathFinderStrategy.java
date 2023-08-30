package com.practice.designpatterns.strategy;

public class BikePathFinderStrategy implements PathFinderStrategy{
    @Override
    public void findPath(String Source, String Destination) {
        System.out.println("in the bike path finder class");
    }
}
