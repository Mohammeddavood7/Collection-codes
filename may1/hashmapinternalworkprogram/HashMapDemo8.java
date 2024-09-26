package com.may1.hashmapinternalworkprogram;

import java.util.HashMap;

class Employee1
{
	int eid;
	String ename;

	Employee1(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}

    @Override
	public boolean equals(Object obj)  //obj = e2
	{		
		if(obj instanceof Employee1)
        {
			Employee1 e2 = (Employee1) obj; //downcasting

			if(this.eid == e2.eid && this.ename.equals(e2.ename))
			{
				return true;
			}
			else
			{
				return false;
			}
	    }
		else
		{
			System.out.println("Comparison is not possible");
			return false;
		}		
	}

	public String toString()
		{
			 return " "+eid+" "+ename;
		}
}
public class HashMapDemo8
{
	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1(101,"Aryan");
		Employee1 e2 = new Employee1(102,"Pooja");
		Employee1 e3 = new Employee1(101,"Aryan");
		Employee1 e4 = e2;
		Employee1 e5 = new Employee1(101,"Aryan");


		
		HashMap<Employee1,String> hm = new HashMap<>();
		hm.put(e1,"Ameerpet");
		hm.put(e2,"S.R Nagar");
		hm.put(e3,"Begumpet");
		hm.put(e4,"Panjagutta");
		hm.put(e5, "HYDERABAD");
		

		hm.forEach((k,v)-> System.out.println(k+" : "+v));
	}
}