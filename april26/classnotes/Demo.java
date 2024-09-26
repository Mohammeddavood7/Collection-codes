package com.april26.classnotes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo
{
	public static void main(String[] args)
	{
		Set<String> hs1 = new HashSet<>();
		hs1.add("a");
		hs1.add("B");
		hs1.add("C");
		hs1.add("D");
		hs1.add("E");
		
		Set<Integer> hs = new HashSet<>();
		hs.add(67); //3
		hs.add(89); //9
		hs.add(33); //1
		hs.add(45); //13
		hs.add(12); //12
		hs.add(35); //3
		hs.add(35);
		//33,67,35,89,12,45

		Set<Integer> hs2 = new HashSet<>();

		System.out.println(hs);
		
		boolean b [] = new boolean[5];
		
		b[0] = hs2.add(1);//true
		b[1] = hs2.add(2);//true
		b[2] = hs2.add(3);//true 
		b[3] = hs2.add(1);//false
		b[4] = hs2.add(4);//true
		if(hs2.contains(1))
		 System.out.println("1 contain");
		
		System.out.println(Arrays.toString(b));

		
		
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		  lhs.add("Ravi");
		  lhs.add("Vijay");
		  lhs.add("Ravi");
		  lhs.add("Ajay");
		  lhs.add("Pawan");
		  lhs.add("Shiva");
		  lhs.add(null);
		  lhs.add("Ganesh");          
		  lhs.forEach(str -> System.out.println(str));
		
		
		
		
		
		
		
	}

}












