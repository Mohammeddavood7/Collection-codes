package com.arraylist_linkedList.task.april23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListToArraysList
{
	public static void main(String[] args) 
	{
		List<Integer> ll = new LinkedList<>();
		ll.add(99);
		ll.add(100);
		ll.add(101);
		List<Integer> al = new ArrayList<>(ll);
	
		al.forEach((arrL) -> System.out.println(arrL));
		
	}

}





























































