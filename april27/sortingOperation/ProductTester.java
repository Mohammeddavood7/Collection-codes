package com.april27.sortingOperation;

import java.util.ArrayList;
import java.util.Collections;

public class ProductTester
{

	public static void main(String[] args)
	{
		Product p1 = new Product(104,"Mobile",44000.0);
		Product p2 = new Product(102,"Laptop",64000.0);
		Product p3 = new Product(103,"Camera",74000.0);
		Product p4 = new Product(101,"Telivision",54000.0);

		
		
		ArrayList<Product> al = new ArrayList<>();
		al.add(p1);
		al.add(p4);
		al.add(p3);
		al.add(p2);
		
		al.forEach(System.out::println);
		System.out.println("----------------------------------------------------");
		
				
		Collections.sort(al);
		al.forEach(System.out::println);

	}
}













