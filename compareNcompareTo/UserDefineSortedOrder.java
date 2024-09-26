package com.compareNcompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDefineSortedOrder
{
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(29);
		al.add(76);
		al.add(44);
		al.add(633);
		al.add(389);
        Collections.sort(al);
        System.out.println(al);
         
        System.out.println("------------------------------------------");
        
		Collections.sort(al,(i1,i2) -> i2-i1);
		System.out.println(al);


		
		
	}

}
