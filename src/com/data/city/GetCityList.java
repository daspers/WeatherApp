package com.data.city;

import com.functions.Functions;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;


public class GetCityList {
  static private GetCityList dummy = null;
  static private City[] citylist = null;
  private GetCityList(){
    try {
      BufferedReader reader = new BufferedReader(new FileReader(getClass().getResource("../../resource/citylist.json").getFile()));
      Gson data = new Gson();
      citylist = data.fromJson(reader, City[].class);
      for(City city : citylist){
        city.setName(city.getName().toUpperCase());
      }
    }
    catch (IOException e){
      e.printStackTrace();
      citylist = null;
    }
  }
  private static void init(){
    if(dummy == null)
      dummy = new GetCityList();
  }
  public static ArrayList<City> byCityName(String cityname){
    init();
    ArrayList<City> result = new ArrayList<City>();
    cityname = cityname.toUpperCase();
    for(City city : citylist){
      if(city.getName().contains(cityname)) {
        result.add(new City(city));
      }
    }
    return result;
  }
}
