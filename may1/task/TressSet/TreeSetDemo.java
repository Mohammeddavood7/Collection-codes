package com.may1.task.TressSet;

import java.util.Set;
import java.util.TreeSet;

record Product(Integer productId,String productName)
{
	public Product
	{
		if(productId <= 0)
		{
			throw new IllegalArgumentException();
		}
	}
}


public class TreeSetDemo
{
	public static void main(String[] args)
	{
		Set<Product> ts = new TreeSet<>((i1,i2)->(i1.productId()-i2.productId()));
		try
		{
			ts.add(new Product(111,"Camera"));
			ts.add(new Product(444,"Mobile"));
			ts.add(new Product(222,"Television"));
			ts.add(new Product(333,"Laptop"));
		}
		catch(Exception e)
		{
			System.err.println("please give id more than 0");
		}
       
		System.err.println("ascending on product id: ");
		ts.forEach(res1 ->System.out.println(res1));
		
		
		
		
		Set<Product> ts1 = new TreeSet<>((i1,i2)->(i2.productId()-i1.productId()));
		ts1.add(new Product(111,"Camera"));
		ts1.add(new Product(444,"Mobile"));
		ts1.add(new Product(222,"Television"));
		ts1.add(new Product(333,"Laptop"));
       
		System.err.println("descending on product id: ");
		ts1.forEach(res1 ->System.out.println(res1));
		
		
		Set<Product> ts2 = new TreeSet<>((i1,i2)->(i1.productName().compareTo(i2.productName())));
		ts2.add(new Product(111,"Camera"));
		ts2.add(new Product(444,"Mobile"));
		ts2.add(new Product(222,"Television"));
		ts2.add(new Product(333,"Laptop"));
       
		System.err.println("Acesending on product name: ");
		ts2.forEach(res1 ->System.out.println(res1));
		
		
		Set<Product> ts3 = new TreeSet<>((i1,i2)->(i2.productName().compareTo(i1.productName())));
		ts3.add(new Product(111,"Camera"));
		ts3.add(new Product(444,"Mobile"));
		ts3.add(new Product(222,"Television"));
		ts3.add(new Product(333,"Laptop"));
       
		System.err.println("descending on product name: ");
		ts3.forEach(res1 ->System.out.println(res1));
		
		
		
	}
	
}



























