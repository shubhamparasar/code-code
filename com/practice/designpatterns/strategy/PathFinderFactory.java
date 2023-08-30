package com.practice.designpatterns.strategy;

import java.util.HashMap;
import java.util.Map;

public class PathFinderFactory {
    Map<String,PathFinderStrategy> finderMap = new HashMap<>();


    public PathFinderStrategy getFactory(PathFinderStrategy pathFinderStrategy){
        return finderMap.get(pathFinderStrategy);
    }
}
