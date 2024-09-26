package com.may7.classnot.ConcurrentCollection.failfastiteratot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arl = new ArrayList<>();   
		arl.add("Apple");   
		arl.add("Orange");
		arl.add("Grapes");
		arl.add("Mango");
		arl.add("Guava");
		arl.add("Mango");

		List<String> syncCollection = Collections.synchronizedList(arl);

		List<String> upperList = new ArrayList<>(); //New List
        
        Runnable r1 = () -> 
        {
               synchronized (syncCollection)
               {
            	   syncCollection.forEach( m -> upperList.add(m.toUpperCase()));
			   }
        };
        
        Thread t1 = new Thread(r1);
        t1.start();
	
         
         

      upperList.forEach(x -> System.out.println(x));
	}
}
	














