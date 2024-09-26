package com.may8.ConcurrentHashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentHashMapExample2
{
   public static void main(String args[])
   { 
       // Creating ConcurrentHashMap
       Map<String, String> cityTemperatureMap = new ConcurrentHashMap<>();
        
        cityTemperatureMap.put("Delhi", "30");
        cityTemperatureMap.put("Mumbai", "32");
        cityTemperatureMap.put("Chennai", "35");
        cityTemperatureMap.put("Bangalore", "22" );
        
        Iterator<String> iterator = cityTemperatureMap.keySet().iterator();  

        while (iterator.hasNext())
        {
          System.out.println(cityTemperatureMap.get(iterator.next()));
          // adding new value, it won't throw error
          cityTemperatureMap.put("Hyderabad", "28");   
       
          
          
        
        }
        Object obj [] = new Object[3];

        CopyOnWriteArrayList<Object> c = new CopyOnWriteArrayList<>(obj) ;
  
        c.add("string");
        System.out.println(c);

        
        
  }
  
}