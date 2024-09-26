package com.may4.hashmap;

import java.util.HashMap;
import java.util.WeakHashMap;

record Student(Integer id,String name)
{
	
}

public class WeakHashMapClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		WeakHashMap<Student,String> whm = new WeakHashMap<>();
		whm.put(new Student(111,"A"), "AA");
		Student s = new Student(222,"B");
		whm.put(s, "BB");
		System.out.println(whm);
		
		s = null;
		System.gc();
		Thread.sleep(1000);
		
		System.out.println(whm);
		System.out.println("------------------------------------------------");
		HashMap<Student,String> whm1 = new HashMap<>();
		whm1.put(new Student(111,"A"), "AA");
		Student s1 = new Student(222,"B");
		whm1.put(s1, "BB");
		System.out.println(whm1);
		
		s1 = null;
		System.gc();
		Thread.sleep(1000);
		
		System.out.println(whm1);
		
		
		
		
	}

}






















