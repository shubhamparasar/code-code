package com.practice.designpatterns.strategy;

public class WalkPathFinderStrategy implements PathFinderStrategy{
    @Override
    public void findPath(String Source, String Destination) {
        System.out.println("in the walk path finder class");
    }
}
