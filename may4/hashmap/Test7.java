package com.may4.hashmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*class Car
{
	int id;
	String name;
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}
	public Car(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class Test5
{
	private static final ArrayList Car = null;

	public static void main(String [] args) 
	{
	ArrayList<Car> a = new ArrayList<>();
	a.add(new Car(111,"a"));
	a.add(new Car(222,"b"));
    a.add(new Car(333,"c"));

	ArrayList b = a;  //assigning Generic to raw type 	          
	System.out.println(b); 
	}
}
*/



/*public class Test6 
{
	public static void main(String[] args) 
	{ 
		List<Integer> myList = new ArrayList<>(); 
		myList.add(4); 
		myList.add(6); 
		myList.add(5);
        
		UnknownClass u = new UnknownClass(); 
		int total = u.addValues(myList); 
		System.out.println("The sum of Integer Object is :"+total); 
	} 
}  
class UnknownClass 
{ 
	public int addValues(List list)  //generic to raw type OR 
	{ 
	Iterator it = list.iterator();    
	int total = 0; 
	while (it.hasNext()) 
	{
		int i = (int) it.next();
		total += i;                           //total = 15
	} 
	return total; 
	} 
} */



public class Test7 
{
	public static void main(String[] args) 
	{ 
//		List<Integer> myList = new ArrayList<>(); 
//
//		myList.add(4); 
//		myList.add(6); 
//		UnknownClass u = new UnknownClass(); 
//		int total = u.addValues(myList); 
//		System.out.println(total); 
		
		Object str [] = new String[9];
		str[0] = (Integer)456;
		System.out.println(str);
	} 
}  
/*class UnknownClass 
{ 
    public int addValues(List list)  
	{ 
		list.add(1);	//adding object to raw type
		Iterator it = list.iterator(); 
		int total = 0; 
		while (it.hasNext()) 
		{
		int i = ((Integer)it.next()); 
		total += i; 
		} 
		return total; 
	} 
} */









