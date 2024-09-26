package com.howmanywaytoretrievedate.fromcollections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class ManyWayToRetrieveData
{
	public static void main(String[] args)
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Gauva");
		
		System.out.println("Retrieving data with toString");
		System.out.println(fruits.toString());
		System.out.println();

		System.out.println("Retrieving data with odinary for loop");
		for(int i = 0 ; i < fruits.size() ; i++)
		System.out.print(fruits.get(i)+" ");
		System.out.println();
		System.out.println();

		
		
		System.out.println("Retrieving data with for Each loop");

        for(String fruit : fruits)
        {
        	System.out.print(fruit+" ");
        }
		
        System.out.println();
        System.out.println();
        
		System.out.println("Retrieving data with ENUMERATION CLASS 1.0V ");

        Enumeration<String> ele = fruits.elements();
        while(ele.hasMoreElements())        
        {
        	System.out.print(ele.nextElement()+" ");
        }
        
        System.out.println();
        System.out.println();
        
		System.out.println("Retrieving data with Iteration CLASS 1.2V ");
		
		Iterator<String> ir = fruits.iterator();
		
		while(ir.hasNext())
		{
			System.out.print(ir.next()+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Retrieving data with ListIteration CLASS 1.2V forword direction ");

		ListIterator<String> ii = fruits.listIterator();
		
		while(ii.hasNext())
		{
			System.out.print(ii.next()+" ");
		}
		
		System.out.println();
        System.out.println();
        
        System.out.println();
		System.out.println("Retrieving data with ListIteration CLASS 1.2V forword direction ");

		while(ii.hasPrevious())
		{
			System.out.print(ii.previous()+" ");
		}
        
		System.out.println();
		System.out.println();
		System.out.println("Retrieving data with Spliterator CLASS 1.8V ");

        Spliterator<String> sp = fruits.spliterator();
        
        sp.forEachRemaining(fruit -> System.out.print(fruit+" "));
        
        System.out.println();
        System.out.println();
        
		System.out.println("Retrieving data with  Method refference CLASS 1.8V ");
        fruits.forEach(System.out::print);
	}

}


































