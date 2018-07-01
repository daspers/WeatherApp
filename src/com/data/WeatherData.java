package com.data;

import com.api.weather.MainData;
import java.util.List;

public class WeatherData {
  private Coordinate coord;
  private String base;
  private MainData main;
  private WindData wind;
  private CloudsData clouds;
  private RainData rain;
  private SnowData snow;
  private int dt;
  private SysBean sys;
  private int id;
  private String name;
  private int cod;
  private List<WeatherResultData> weather;

  public Coordinate getCoord() {
    return coord;
  }

  public void setCoord(Coordinate coord) {
    this.coord = coord;
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public MainData getMain() {
    return main;
  }

  public void setMain(MainData main) {
    this.main = main;
  }

  public WindData getWind() {
    return wind;
  }

  public void setWind(WindData wind) {
    this.wind = wind;
  }

  public CloudsData getClouds() {
    return clouds;
  }

  public void setClouds(CloudsData clouds) {
    this.clouds = clouds;
  }

  public RainData getRain() {
    return rain;
  }

  public void setRain(RainData rain) {
    this.rain = rain;
  }

  public SnowData getSnow() {
    return snow;
  }

  public void setSnow(SnowData snow) {
    this.snow = snow;
  }

  public int getDt() {
    return dt;
  }

  public void setDt(int dt) {
    this.dt = dt;
  }

  public SysBean getSys() {
    return sys;
  }

  public void setSys(SysBean sys) {
    this.sys = sys;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCod() {
    return cod;
  }

  public void setCod(int cod) {
    this.cod = cod;
  }

  public List<WeatherResultData> getWeather() {
    return weather;
  }

  public void setWeather(List<WeatherResultData> weather) {
    this.weather = weather;
  }

  public static class SysBean {
    private int type;
    private int id;
    private double message;
    private String country;
    private int sunrise;
    private int sunset;

    public int getType() {
      return type;
    }

    public void setType(int type) {
      this.type = type;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public double getMessage() {
      return message;
    }

    public void setMessage(double message) {
      this.message = message;
    }

    public String getCountry() {
      return country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    public int getSunrise() {
      return sunrise;
    }

    public void setSunrise(int sunrise) {
      this.sunrise = sunrise;
    }

    public int getSunset() {
      return sunset;
    }

    public void setSunset(int sunset) {
      this.sunset = sunset;
    }
  }
}
