package com.may8.ConcurrentHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class DemoOnConcurrentSet 
{
	public static void main(String[] args)
	{
		
		CopyOnWriteArraySet<String> cs = new CopyOnWriteArraySet<>();
		cs.add("Mango");
		cs.add("Apple");
		cs.add("Grapes");
		cs.add("Guava");
		cs.add("Orange");
		cs.add("Orange");

		
		
		Iterator<String> it = cs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		cs.add("kiwi");
		System.out.println("------------------------------------");
		
		cs.forEach(System.out::println);
		
		
		List<Integer> of = List.of(10,20,30,49,86,467);
		of.add(88);
		
		System.out.println("--------------------------------------");
		ArrayList<Integer> al = new ArrayList<>(of);
	    al.forEach(System.out::println);
		System.out.println("--------------------------------------------");
	    List<CopyOnWriteArraySet<String>> asList = Arrays.asList(cs);
	    Iterator<CopyOnWriteArraySet<String>> it1 = asList.iterator();
	    
	    while(it1.hasNext())
	    {
	    	
	    	it1.next().forEach(System.out::println);
	    }
	}

}



























