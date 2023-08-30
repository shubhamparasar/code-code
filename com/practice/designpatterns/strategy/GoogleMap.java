package com.practice.designpatterns.strategy;

import java.util.HashMap;
import java.util.Map;

public class GoogleMap {

    private static GoogleMap googleMap = null;
    public Map<String,PathFinderStrategy> finderMap = new HashMap<>();

    private GoogleMap(){
        finderMap.put(PathFinder.CAR,new CarPathFinderStrategy());
        finderMap.put(PathFinder.BIKE,new BikePathFinderStrategy());
        finderMap.put(PathFinder.WALK,new WalkPathFinderStrategy());
    }


    public static GoogleMap getInstance(){
        if(googleMap==null){
            googleMap = new GoogleMap();
        }
        return googleMap;
    }
    public PathFinderStrategy getFactory(String pathFinder){
        return finderMap.get(pathFinder);
    }

    public void findPath(String source, String destination,PathFinderStrategy pathFinderStrategy){
        pathFinderStrategy.findPath(source,destination);
    }
}
