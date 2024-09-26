package com.april26.taskon.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Directory 
{
	private List<Employee> al = new ArrayList<>();
	Scanner sc  = new Scanner(System.in);
	public List<Employee> getAl() 
	{
		return al;
	}


	public void addEmployee()
	{
		System.out.print("enter employee name: ");
		String name = sc.next();
		System.out.print("enter employee position: ");
		String position = sc.next();
		System.out.print("enter employee salary: ");
		double salary = sc.nextDouble();
		Employee emp =  new Employee(name,position,salary);
		al.add(emp);
	}
	
	
	public void displayAllEmployee()
	{
		for(Employee e : al)
		{
			System.out.println(e);
		}
 	}
	
	public void updateEmployee(int index)
	{
		int count = 0;
		
	   for(Employee e : al)
	   {
		   count++;
		    if(count == index)
		    {
		    	
		    	System.out.print("enter index position employee object to update(name): ");
				String un = sc.nextLine();
				un = sc.nextLine();
				System.out.print(e.getPosition()+" ");
				e.setPosition(un);
				System.out.print("successfully changed to the '"+e.getPosition()+"' position");
				System.out.println();
		    }
 
	   }
	}
	
	public void deleteEmployee(int index)
	{
		
				al.remove(index);
				System.out.println("Employee object removed successfully: ");
				System.out.println(al.get(index));
	}
	

}


















