package com.data.city;

import com.data.Coordinate;

public class City {
  private String id;
  private String name;
  private Coordinate coor;
  private String countrycode;
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
  City(City other){
    this(new String(other.getID()), new String(other.getName()), new Coordinate(other.getCoordinate()), new String(other.getCountryCode()));
  }
  public String getID(){
    return id;
  }
  public String getName(){
    return name;
  }
  public Coordinate getCoordinate(){
    return coor;
  }
  public String getCountryCode(){
    return countrycode;
  }
}
