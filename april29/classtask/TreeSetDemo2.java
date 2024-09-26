package com.april29.classtask;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*public class TreeSetDemo1
{
	public static void main(String[] args) 
	{
		TreeSet<String> t1 = new TreeSet<>();
		t1.add("Orange"); 
		t1.add("Mango");
		t1.add("Pear");
		t1.add("Banana");
		t1.add("Apple");	
		System.out.println("In Ascending order");
		t1.forEach(i -> System.out.println(i));

		TreeSet<String> t2 = new TreeSet<>();
		t2.add("Orange");
		t2.add("Mango");
		t2.add("Pear");
		t2.add("Banana");
		t2.add("Apple");
		
		Iterator<String> it = t2.descendingIterator();
		it.forEachRemaining(x -> System.out.println(x));

        System.out.println("In Descending order");
		Iterator<String> itr2 = t2.descendingIterator();  //for descending order

         itr2.forEachRemaining(x -> System.out.println(x));		
	}
}*/


class TreeSetDemo2
{
	public static void main(String[] args) 
	{
		/*Set<String> t = new TreeSet<>();  
		t.add("6");   
		t.add("5");
		t.add("4");
		t.add("2");
		t.add("9");	
		Iterator<String> iterator = t.iterator();
		iterator.forEachRemaining(x -> System.out.println(x));

		//From 1.8 to replace hasNext() and next() method*/
		
		
		
		Set<Character> t = new TreeSet<>();  
		t.add('A'); 
		t.add('C');
		t.add('B');
		t.add('E');
		t.add('D');	
		Iterator<Character> iterator = t.iterator();
		iterator.forEachRemaining(x -> System.out.println(x));
	}
	
}








































