package com.forEachMethodandforEachRemaining;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class RetrieveDataforEach 
{
	//RetrieveData forEach Method and forEachRemaining 
	
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Hyderabad");
		al.add("Pune");
		al.add("Indore");
		al.add("Noida");
		
		Consumer<String> cons = str -> System.out.println(str.toLowerCase());
		
		al.forEach(cons);
		System.out.println("-------------------------------------");
		Spliterator<String> sr = al.spliterator();
		sr.forEachRemaining(cons);
		System.out.println("----------------------");
		sr.forEachRemaining(str -> System.out.println(str));
		
		
		
		
	}
	

}





















