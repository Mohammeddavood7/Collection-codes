package com.arraylist_linkedList.task.april23;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TraverseElements 
{
	public static void main(String[] args) 
	{
		List<String> al =new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		
		ListIterator<String> li = al.listIterator();

	System.out.println("OUTPUT IS FORWORD DIRECTION : ");
      
	while(li.hasNext())
      {
    	  System.out.println(li.next());
      }
  	System.out.println("OUTPUT IS BACKWARD DIRECTION : ");

  	while(li.hasPrevious())
    {
  	  System.out.println(li.previous());
    }
     
  	
	}
}












