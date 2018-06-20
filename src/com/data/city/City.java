package com.data.city;

import com.data.Coordinate;

public class City {
  private int id;
  private String name;
  private Coordinate coord;
  private String country;
  public City(int _id, String _nm, Coordinate _coor, String _cc){
    id = _id;
    name = _nm;
    coord = _coor;
    country = _cc;
  }
  public City(int _id, String _nm, double lat, double lon, String _cc){
    id = _id;
    name = _nm;
    coord = new Coordinate(lat, lon);
    country = _cc;
  }
  public City(String[] arr){
    id = Integer.parseInt(arr[0]);
    name = arr[1];
    coord = new Coordinate(Double.parseDouble(arr[2]), Double.parseDouble(arr[3]));
    country = arr[4];
  }
  public City(City other){
    this(other.getId(), new String(other.getName()), new Coordinate(other.getCoord()), new String(other.getCountry()));
  }
  public String getName(){
    return name;
  }
  public Coordinate getCoord(){
    return coord;
  }

  public String getCountry() {
    return country;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCoord(Coordinate coord) {
    this.coord = coord;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
