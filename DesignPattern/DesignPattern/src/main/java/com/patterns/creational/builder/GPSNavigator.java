package com.patterns.creational.builder;

/**
 * 产品特征2 GPS导航
 */
public class GPSNavigator {
    private final String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }
}
