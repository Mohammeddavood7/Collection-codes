package com.may10.StreamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class LOWERCaseTOUpperCase
{
	public static void main(String[] args) 
	{
	   List<String> asList = Arrays.asList("hello","ravi","shak","afsal","davood");
	   List<Character> l = asList.stream().map(lf->lf.toUpperCase().charAt(0)).collect(Collectors.toList());
	   
	   Iterator<String> it = asList.iterator();
	   int index = 0; 
	   while(it.hasNext())
	   {
		   int p = 0;
		   String name = it.next();
		   char[] ch = name.toCharArray();
		   Character c = l.get(index++);
		   ch[p] = c;
		    
		   for(int i = 0 ; i < ch.length ; i++)
		   {
			    System.out.print(ch[i]);
		   }
		   System.out.println();
		   
				   		   
	   }
	   
	}
}













