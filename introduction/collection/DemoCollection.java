package com.introduction.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class DemoCollection
{
	public static void main(String[] args)
	{
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		
		Vector v2 = new Vector();
		v2.add("hello");
		v2.add(true);
		v2.add(49.9);
		v2.add(45.8f);
		
		//v1.addAll(v2);
		
		//System.out.println(v1);
		
		//v1.retainAll(v2);
		//v1.remove(Integer.valueOf(20));
		//v1.removeAllElements();
		//System.out.println(v1);
		//System.out.println(v1.size());
//		v1.clear();
//        System.out.println(		v1.size());		
//		
		List v3 = new Vector();
		
		v3.add(39);
		v3.add(12);
		v3.add(9);
		v3.add(33);
		
		v3.sort(null);
		//System.out.println(v3);
		v3.remove(Integer.valueOf(Integer.parseInt(new String("39"))));
		System.out.println(v3);
		
		Set s1 = new HashSet();
		s1.add(10);
		s1.add(10);
		s1.add(30);
		s1.add(40);

		
		//System.out.println(s1);
		
		
		
		
		
		
	}

}
























