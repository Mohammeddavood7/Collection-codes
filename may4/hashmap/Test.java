package com.may4.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*public class HashMapInternals 
{
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<>();
		map.put("Ravi","Ampt");
		map.put(new String("Ravi"),"Hyd");

		System.out.println(map);
        }
}*/


/*public class BufferTest
	{
	   public static void main(String [] args)
	   {
	    Integer i1 = 128;
		Integer i2 = 128;		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
	    }
	 }*/


/*public class BufferTest
{
   public static void main(String [] args)
   {
        Map<Integer,String> map = new HashMap<>();
	map.put(128,"Ampt");
	map.put(new Integer(128),"Hyd");
	System.out.println(map.size());
    }
 }*/



/*public class CollectionExample 
{
   public static void main(String[] args) 
     {
	HashMap hash = new HashMap<>();
	hash.put("nit", 500);
	hash.put("info", 644);
	hash.put("tech", "google");
	System.out.println(hash.get("tech"));//google
	System.out.println(hash.get("google"));//null
	System.out.println(hash.getOrDefault("nit", "Technology"));//500
	System.out.println(hash.get("info"));//644
     }
}*/

/*public class HashMapExample 
{
   public static void main(String[] args) 
     {
	
        Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("orange", 3);
	    map.replaceAll((k, v) -> v * 2);

	    System.out.println(map);
     }
}*/










/*public class Participate 
{
  public static void main(String args[]) {
	        HashMap participant = new HashMap();
	        participant.put(1 + 1, "Dhoni");
	        participant.put(1 + 1, "Kohli");
	        participant.put(2 + 1, "Rohit");
	        Set set = participant.entrySet();
	        Iterator itr = set.iterator();
	        while (itr.hasNext()) {
	            Map.Entry m = (Map.Entry)itr.next();
	            System.out.print(m.getKey() + " " + m.getValue()+" ");
	        }
}
}
*/


/*public class Test
{
      public static void main(String[] args) 
      {
           Map<ToDos, String> m = new HashMap<ToDos, String>();
           ToDos t1 = new ToDos("Monday");
           ToDos t2 = new ToDos("Monday");
           ToDos t3 = new ToDos("Tuesday");
          // ToDos t4 = new ToDos("Tuesday");

           m.put(t1, "doLaundry");
           m.put(t2, "payBills");
           m.put(t3, "cleanAttic");
           //m.put(t4, "cleanAttic");

           System.out.println(m.size());
     }
}

class ToDos 
{
      String day;

      ToDos(String d) 
      {
           day = d;
      }

      public boolean equals(Object o) 
      {
            return ((ToDos) o).day == this.day;
      }

	  //Comment hashcode method and see and analyse the result 
     //public int hashCode() { return 9; }
}*/




/*public class Test
{
      public static void main(String[] args)
      {
           NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
           map.firstKey();
           System.out.println(map.size());
      }
}*/


public class Test
{
      public static void main(String[] args) 
      {
           Map<String, Integer> map = new HashMap<String, Integer>();
           map.put("T", 1);
           map.put("M", 2);
           Set<String> keySet = map.keySet();
           keySet.add("A");
           System.out.println(map.size());
     }
}





































