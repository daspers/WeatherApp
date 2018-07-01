package com.city;

import com.data.CityData;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class GetCityList {
  static private CityData[] citylist = null;
  private GetCityList() throws IOException{
      BufferedReader reader = new BufferedReader(new FileReader(getClass().getResource("../../resource/citylist.json").getFile()));
      Gson data = new Gson();
      citylist = data.fromJson(reader, CityData[].class);
      for(CityData city : citylist) {
        city.setName(city.getName().toUpperCase());
      }
  }
  private static void init() throws IOException{
    if(citylist == null)
      new GetCityList();
  }
  public static ArrayList<CityData> byCityName(String cityname) throws IOException{
    init();
    ArrayList<CityData> result = new ArrayList<CityData>();
    cityname = cityname.toUpperCase();
    for(CityData city : citylist){
      if(city.getName().contains(cityname)){
        result.add(new CityData(city));
      }
    }
    return result;
  }
}
