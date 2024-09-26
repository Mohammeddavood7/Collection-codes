package com.may9.StreamAPI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test
{
	public static void main(String args[]) 
	{
		Set s = new HashSet();
		s.add(new Long(10));
		s.add(new Integer(10));
		for (Object object : s)
		{
		    System.out.println("test - " + object);
	    }
		
		List < ? > l1 = new ArrayList < > ();


		 List < String > l2 = new ArrayList();


		// List < ? super Object > l3 = new ArrayList < String > ();


		 List < ? extends Object > l4 = new ArrayList < String > ();
		
		 TreeSet < String > s1 = new TreeSet < > ();
		// s1.add(null);
		
		 List < ? super Number > list = new ArrayList < Object > (); // 1
		 list.add(new Integer(2)); 
		 list.add(new Double(0)); // 3
		 
		 
		
		 TreeSet < Object > ts=new TreeSet < > ();
		 ts.add("a");
		 ts.add("c");
		 ts.add("b");
//		 ts.add(4);
//		 ts.add(5);

		// System.out.println(ts);
		 
		 
		 
		 
		 Vector obj = new Vector(4, 2);
		 obj.addElement(new Integer(3));
		 obj.addElement(new Integer(2));
		 obj.addElement(new Integer(5));
		 System.out.println(obj.capacity());
		 
		 Queue < String > x = new PriorityQueue < String > ();
		 
		 x.add("one");
		 x.add("two");
		 x.add("TWO");
		 System.out.println(x.poll());
		 
		 
		 
		 
		 
		 
		 
   }
}










