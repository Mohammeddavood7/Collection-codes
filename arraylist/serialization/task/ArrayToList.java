package com.arraylist.serialization.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList
{
	
	public static List<String> convertToList(String [] inputArray)
	{
		
		if(inputArray == null)
		{
			return null;
		}
		else if(inputArray.length == 0)
		{
			return new ArrayList<>();
			
		}
		else
		{
			return Arrays.asList(inputArray);
		}
		
	}

}
