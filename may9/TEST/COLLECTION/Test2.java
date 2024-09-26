package com.may9.TEST.COLLECTION;

import java.util.TreeSet;

public class Test2
{
	public static void main(String[] args)
	{
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(44);
		ts.add(99);
		ts.add(33);
		ts.add(22);
		ts.add(11);
		
	  TreeSet<Integer> ts1 = new TreeSet<>(ts);
       System.out.println(ts1);
		
	}

}




















