package com.data;

public class Coordinate {
  private double lat;
  private double lon;
  public Coordinate(double _lat, double _lon){
    lat = _lat;
    lon = _lon;
  }
  public Coordinate(Coordinate other){
    this(other.getLat(), other.getLon());
  }
  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getLon() {
    return lon;
  }

  public void setLon(double lon) {
    this.lon = lon;
  }
}
