package com.april30.classnotMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MethodofHashMap
{
	public static void main(String[] args)
	{
		Map<String ,String> hm = new HashMap<>();
		hm.put("ravi", "111");
        hm.put("sudha", "888");
        
       // System.out.println(hm.get("ravii"));
        
      //System.out.println(hm.getOrDefault("ravi","it is not available"));
		
	  //System.out.println(hm.containsValue("333"));
		
		hm.remove("ravi");
		//hm.clear();
//		System.out.println(hm);
//		System.out.println(hm.isEmpty());
//		System.out.println(hm.size());
		
		Map<String,String> hm1 = new HashMap<>();
		hm1.put("111", "1010");
		hm1.put("222", "2020");
		hm1.put("333", "3030");
		
		hm.putAll(hm1);
		//System.out.println(hm);
		
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
//		System.out.println(hm.entrySet());
		Set<Entry<String, String>> entrySet = hm.entrySet();
		entrySet.forEach(r -> System.out.println(r));
//		for(Entry<String, String> c : entrySet)
//		{
//			System.out.println(c);
//		}

		
		
		
	}

}
















