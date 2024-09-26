package com.arraylist.serialization.task;

import java.util.List;

public class ArrayToListELC
{
	public static void main(String[] args) 
	{
		String str1[] = {"welcome to nareshit"};
	    String str2[] = {};
	    String str3[] = null;
	    
        List<String> ctl1 = ArrayToList.convertToList(str1);
        List<String>  ctl2= ArrayToList.convertToList(str2);
        List<String> ctl3 = ArrayToList.convertToList(str3)	;	
         
		System.out.println(ctl1);
		System.out.println(ctl2);
		System.out.println(ctl3);

	}

}
