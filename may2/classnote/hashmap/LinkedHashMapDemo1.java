package com.may2.classnote.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

/*public class Demo
{
public static void main(String args[]) 
	{
			Map<Integer,String> map = new HashMap<>(); 
			map.put(1, "C");
			map.put(2, "C++");
			map.put(3, "Java");
			map.put(4, ".net");
		
			map.forEach((k,v)->System.out.println("Key :"+k+" Value :"+v) );           
			           
			System.out.println("Return Old Object value :"+map.put(4,"Python"));  

			Set keys =  map.keySet();
			System.out.println("All keys are :"+keys);

			Collection values = map.values();
			System.out.println("All values are :"+values);
		
			for(Map.Entry<Integer, String> m : map.entrySet())
			 {  
				 System.out.println(m.getKey()+" = "+m.getValue());  
			}  
	}    
}*/
/*import java.util.HashMap;
public class HashMapDemo3
{
public static void main(String args[]) 
  {
		HashMap<Integer,String> map = new HashMap<>(26,0.95f);
		map.put(1, "Java");
		map.put(2, "is");
		map.put(3, "best");
		map.remove(3);  //will remove the complete Entry
		String val= (String)map.get(3);
		System.out.println("Value for key 3 is: " + val);
		map.forEach((k,v)->System.out.println(k +" : "+v));
   }    
}*/




/*public class HashMapDemo5 
{
     public static void main(String[] argv) 
     {
          Map<String,String> map = new HashMap<>(9, 0.85f);
          map.put("key", "value");
          map.put("key2", "value2");
          map.put("key3", "value3");
		  map.put("key7","value7");


		   Set keys = map.keySet();//keySet return type is Set
		   System.out.println(keys ); //[]

          Collection val = map.values(); //values return type is collection
          System.out.println(val);
         
		  map.forEach((k,v)-> System.out.println(k+" : "+v));
		  
          	  
      }
}*/


public class LinkedHashMapDemo1 
{
      public static void main(String[] a) 
      {
           Map<String,String> map = new LinkedHashMap<>();
           map.put("Ravi", "1234");
		   map.put("Rahul", "1234");
		   map.put("Aswin", "1456");
		   map.put("Samir", "1239");
           
		   map.forEach((k,v)->System.out.println(k+" : "+v));
      }
}





















