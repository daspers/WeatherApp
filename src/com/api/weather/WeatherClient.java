package com.api.weather;

import com.data.ForecastData;
import com.data.WeatherData;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherClient {
  private final String apikey;
  private static final String apilink = "http://api.openweathermap.org/data/2.5/";
  private static final String appid = "&APPID=";
  private static final String metric = "&units=metric";
  private static final String weather = "weather?";
  private static final String forecast = "forecast?";
  private static final String id = "id=";
  public WeatherClient(String _key){
    apikey = _key;
  }
  public WeatherData getWeatherData(String cityid){
    WeatherData weatherobj = null;
    try {
      String jsondata = getData(new URL(apilink + weather + id + cityid + metric + appid + apikey));
      Gson data = new Gson();
      System.out.println(jsondata);
      weatherobj = data.fromJson(jsondata, WeatherData.class);
    }
    catch(MalformedURLException e){
      e.printStackTrace();
    }
    return weatherobj;
  }
  public ForecastData getForecastData(String cityid){
    ForecastData forecastobj = null;
    try {
      String jsondata = getData(new URL(apilink + forecast + id + cityid + metric + appid + apikey));
      Gson data = new Gson();
      System.out.println(jsondata);
      forecastobj = data.fromJson(jsondata, ForecastData.class);
    }
    catch(MalformedURLException e){
            e.printStackTrace();
    }
    return forecastobj;
  }
  private String getData(URL url){
    BufferedReader reader = null;
    String data = null;
    try {
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");
      System.out.println(con.getResponseCode());
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      data = reader.readLine();
    }
    catch (IOException e){
      e.printStackTrace();
    }
    finally {
      if(reader!=null) {
        try {
          reader.close();
        }
        catch (IOException e){
          e.printStackTrace();
        }
      }
    }
    return data;
  }
}
