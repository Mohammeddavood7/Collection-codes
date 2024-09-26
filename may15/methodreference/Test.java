package com.may15.methodreference;

import java.util.Scanner;
import java.util.function.Function;

record Employee(String name)
{
	
}

public class Test
{
	public static void main(String[] args)
	{ 
		Function<Integer,Employee[]> emp = Employee[]::new;
		Employee[] employee = emp.apply(3);
		
	    Scanner sc = new Scanner(System.in);
	    
	    for (int i = 0 ; i < employee.length ; i++)
	    {
	    	System.out.print("Enter '"+ (i+1) +"' name: ");
	    	String name = sc.next();
	    	employee[i] = new Employee(name);
	    }
	    
	    for(Employee em: employee)
	    {
	    	System.out.println(em.name());
	    }
		
	    sc.close();
		
	}

}






















