package com.may11.Optionalandmethodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AbitaryMethodReference 
{
	public static void main(String[] args)
	{
		
		List<Integer> asList = Arrays.asList(9,3,5,1,2,4,6);
		Collections.sort(asList,Integer::compareTo);
		System.out.println(asList);
		
	}

}
