package com.arraylist_linkedList.task.april23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList
{
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(44);
		al.add(66);
		al.add(88);
		al.add(11);
		al.add(22);
		System.out.println(al);
		Collections.reverse(al);
	    al.forEach(p ->System.out.println(p));


		
	}

}

















