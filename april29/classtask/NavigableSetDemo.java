package com.april29.classtask;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo 
{   
    public static void main(String[] args)
    {
        NavigableSet<Integer> ns = new TreeSet<>(); 
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);
        ns.add(9);


		//System.out.println("lower(3): " + ns.lower(89));//Just below than the specified element or null
          
       //System.out.println("floor(3): " + ns.floor(89)); //Equal  less or null
     
      //System.out.println("higher(3): " + ns.higher(-11));//Just greater than specified element or null
  
      //System.out.println("ceiling(3): " + ns.ceiling(10));//Equal or greater or null 
	   
        	
    }
}