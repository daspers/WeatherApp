package com.data;

import com.api.weather.MainData;
import com.data.city.City;
import java.util.List;

public class ForecastData {
  private String cod;
  private double message;
  private int cnt;
  private City city;
  private List<ListBean> list;

  public String getCod() {
    return cod;
  }

  public void setCod(String cod) {
    this.cod = cod;
  }

  public double getMessage() {
    return message;
  }

  public void setMessage(double message) {
    this.message = message;
  }

  public int getCnt() {
    return cnt;
  }

  public void setCnt(int cnt) {
    this.cnt = cnt;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public List<ListBean> getList() {
    return list;
  }

  public void setList(List<ListBean> list) {
    this.list = list;
  }

  public static class ListBean {
    private int dt;
    private MainData main;
    private CloudsData clouds;
    private WindData wind;
    private RainData rain;
    private SnowData snow;
    private SysBean sys;
    private String dt_txt;
    private List<WeatherResultData> weather;

    public int getDt() {
      return dt;
    }

    public void setDt(int dt) {
      this.dt = dt;
    }

    public MainData getMain() {
      return main;
    }

    public void setMain(MainData main) {
      this.main = main;
    }

    public CloudsData getClouds() {
      return clouds;
    }

    public void setClouds(CloudsData clouds) {
      this.clouds = clouds;
    }

    public WindData getWind() {
      return wind;
    }

    public void setWind(WindData wind) {
      this.wind = wind;
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

    public SysBean getSys() {
      return sys;
    }

    public void setSys(SysBean sys) {
      this.sys = sys;
    }

    public String getDt_txt() {
      return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
      this.dt_txt = dt_txt;
    }

    public List<WeatherResultData> getWeather() {
      return weather;
    }

    public void setWeather(List<WeatherResultData> weather) {
      this.weather = weather;
    }

    public static class SysBean {
      private String pod;

      public String getPod() {
        return pod;
      }

      public void setPod(String pod) {
        this.pod = pod;
      }
    }
  }
}
