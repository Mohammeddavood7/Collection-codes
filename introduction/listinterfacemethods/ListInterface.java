package com.introduction.listinterfacemethods;

import java.util.List;
import java.util.Vector;

public class ListInterface 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new Vector<>();
		li.add(null);
		li.add(0,44);
		li.add(2,88);
		li.add(1,99);
		//44,99,null,88
		li.set(2, 77);
		System.out.println(li);

		//System.out.println(li.indexOf(null));
	}

}































