package com.may1.hashmapinternalworkprogram;

import java.util.HashMap;
import java.util.HashSet;

class Employee
{
	int eid;
	String ename;

	Employee(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}

    @Override
	public boolean equals(Object obj)  //obj = e2
	{		
		if(obj instanceof Employee)
        {
			Employee e2 = (Employee) obj; //downcasting

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
public class HashMapDemo
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(101,"Aryan");
		Employee e2 = new Employee(102,"Pooja");
		Employee e3 = new Employee(101,"Aryan");
		Employee e4 = e2;

		
		HashMap<Employee,String> hm = new HashMap<>();
		
		hm.put(e1,"Ameerpet");
		hm.put(e2,"S.R Nagar");
		hm.put(e3,"Begumpet");
		hm.put(e4,"Panjagutta");
		
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		//System.out.println(set);
		
		HashMap<String,Integer> hs1 = new HashMap<>();
		hs1.put("A", 1);
		hs1.put("A", 2);
		hs1.put(new String("A"), 3);
		
		HashMap hs2 = new HashMap();
		hs2.put(65, 1);
		hs2.put(new Integer(65), 2);
		hs2.put("A", 2);
		hs2.put(new String("A"), 3);
		System.out.println(hs2.size());

		
		
		System.out.println(hs1.size());

		
		
		
		//hm.forEach((k,v)-> System.out.println(k+" : "+v));
	}
}









