package com.may9.TEST.COLLECTION;

import java.util.ArrayList;
import java.util.Collections;

record Employee(String name,Integer id)
{
	
}

public class Test1
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("A",8));
		al.add(new Employee("C",7));
		al.add(new Employee("B",2));
		ArrayList<String> name = new ArrayList<>(); 
		ArrayList<Integer> id = new ArrayList<>(); 

		
		for(Employee e : al )
		{
			if(e.name() instanceof String)
			{
				name.add(e.name());
				
			}
			
			if(e.id() instanceof Integer)
			{
				id.add(e.id());
			}
			
		}
		
		
		
		Collections.sort(id);
		Collections.sort(name);
		System.out.println(name);
		System.out.println(id);

		

	}
	

}





















