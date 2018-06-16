package com.data;

public class Coordinate {
    private String lon;
    private String lat;
    Coordinate(String _lon, String _lat){
        lon = _lon;
        lat = _lat;
    }
    String longitude(){
        return lon;
    }
    String latitude(){
        return lat;
    }
}
