package com.data;

public class Coordinate {
    private String lat;
    private String lon;
    public Coordinate(String _lat, String _lon){
        lat = _lat;
        lon = _lon;
    }
    String longitude(){
        return lon;
    }
    String latitude(){
        return lat;
    }
}
