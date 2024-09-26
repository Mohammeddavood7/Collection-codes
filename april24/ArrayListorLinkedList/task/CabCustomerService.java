package com.april24.ArrayListorLinkedList.task;

import java.util.ArrayList;

public class CabCustomerService 
{
	private ArrayList<CabCustomer> cabCustomer;
	
	public void addCabCustomer(CabCustomer cabCustomer)
	{
		
		this.cabCustomer = new ArrayList<>();
		this.cabCustomer.add(cabCustomer);
		

		
	}
	
	public boolean isFirstCustomer(CabCustomer c)
	{
	      int count = 0;
	      
	      for(CabCustomer cs : cabCustomer)
	      {
	    	  if(cs.getPhone().equals(c.getPhone()))
	    	  {
	    	     count++;
	    	  }
	    	  
	    	  
	      }
	      
		return count == 1 ;
	}
		
	public int calculateBill(CabCustomer c)
	{
		 int result = 0;
	
		if(!this.isFirstCustomer(c)) 
		{
			 return 0;
		}
		else if(c.getDistance() <= 4)
		{
			result = 80;
		}
		else if(c.getDistance() > 4)
		{
			result = 80 + 6 * (c.getDistance() - 4);
		}
		return result;
	
		
	}
	
	public void pritBill(CabCustomer c)
	{
		 System.out.println(c.getCustomerName()+" please pay your bill of rs: "+calculateBill(c));
		
	}

}



















