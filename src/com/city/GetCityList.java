package com.data.city;

import com.functions.Functions;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;


public class GetCityList {
  static private City[] citylist = null;
  private GetCityList() throws IOException{
      BufferedReader reader = new BufferedReader(new FileReader(getClass().getResource("../../resource/citylist.json").getFile()));
      Gson data = new Gson();
      citylist = data.fromJson(reader, City[].class);
      for(City city : citylist) {
        city.setName(city.getName().toUpperCase());
      }
  }
  private static void init() throws IOException{
    if(citylist == null)
      new GetCityList();
  }
  public static ArrayList<City> byCityName(String cityname) throws IOException{
    init();
    ArrayList<City> result = new ArrayList<City>();
    cityname = cityname.toUpperCase();
    for(City city : citylist){
      if(city.getName().contains(cityname)){
        result.add(new City(city));
      }
    }
    return result;
  }
}