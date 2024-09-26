package com.arraylist_linkedList.task.april23;

import java.util.ArrayList;

public class RemoveElementsFromArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(8);
		al.add(9);
		al.add(5);
		al.add(3);
		
		al.remove(0);
		al.remove(Integer.valueOf(9));
		al.forEach((r)->System.out.println(r));

		
	}

}
