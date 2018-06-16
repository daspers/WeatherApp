package com.data.city;

import com.data.Coordinate;

public class City {
    String id;
    String name;
    Coordinate coor;
    String countrycode;
    City(String _id, String _nm, Coordinate _coor, String _cc){
        id = _id;
        name = _nm;
        coor = _coor;
        countrycode = _cc;
    }
    City(String _id, String _nm, String lat, String lon, String _cc){
        id = _id;
        name = _nm;
        coor = new Coordinate(lat, lon);
        countrycode = _cc;
    }
    City(String[] arr){
        id = arr[0];
        name = arr[1];
        coor = new Coordinate(arr[2], arr[3]);
        countrycode = arr[4];
    }
    public String getCityID(){
        return id;
    }
    public String getCityName(){
        return name;
    }
    public Coordinate getCityCoordinate(){
        return coor;
    }
    public String getCityCountryCode(){
        return countrycode;
    }
}
