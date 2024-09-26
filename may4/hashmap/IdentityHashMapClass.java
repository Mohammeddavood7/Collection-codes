package com.may4.hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

record Employe(Integer id,String name) {}

public class IdentityHashMapClass 
{
	public static void main(String[] args)
	{
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(1, 100);
		hm.put(128, 200);
		hm.put(128, 300);
		System.out.println(hm);
		
		System.err.println("difference b/w the HashMap and IdentityHashMap");
		
		IdentityHashMap<Integer,Integer> ihm = new IdentityHashMap<>();
		ihm.put(1, 100);
		ihm.put(128, 200);
		ihm.put(128, 300);
		System.out.println(ihm);

		
		
	}

}






















