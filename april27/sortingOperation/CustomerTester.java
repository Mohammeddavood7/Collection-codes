package com.april27.sortingOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomerTester
{
   public static void main(String[] args) 
   {
	   Customer c1 = new Customer(444,"scott",55000.0);
	   Customer c2 = new Customer(222,"mith",68907.0);
	   Customer c3 = new Customer(111,"ward",25000.0);
	   Customer c4 = new Customer(333,"ciller",45000.0);

	   ArrayList<Customer> al = new ArrayList<>();
	   al.add(c1);
	   al.add(c2);
	   al.add(c3);
	   al.add(c4);
	   
	   Comparator<Customer> com1 = new Comparator<>()
	  {
		   @Override
			public int compare(Customer c1, Customer c2)
			{
				return c1.getCustomerNumber() - c2.getCustomerNumber();
			}
	  };
	  
	  Collections.sort(al,com1);
	  
	  al.forEach(System.out::println);
	  
	  System.out.println("-------------------------------------------");
	  
	  
	  Comparator<Customer> com2 = new Comparator<>()
	  {
		   @Override
			public int compare(Customer c1, Customer c2)
			{
				return c1.getCustomerName().compareTo(c2.getCustomerName());
			}
	  };
	  
	  Collections.sort(al,com2);
	  
	  al.forEach(System.out::println);
	  
	  System.out.println("-------------------------------------------");
	  
	  
	  Comparator<Customer> com3 = new Comparator<>()
	  {
		   @Override
			public int compare(Customer c1, Customer c2)
			{
				return c1.getCustomerBill().compareTo(c2.getCustomerBill());
			}
	  };
	  
	  Collections.sort(al,com3);
	  
	  al.forEach(System.out::println);
	  
	  
	  

	   
	   
	  
   }
   
	
}
