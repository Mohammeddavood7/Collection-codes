package com.may11.Optionalandmethodreference;

import java.util.Vector;

class Even
{
	public static void isEven(Integer num)
	{
		if(num%2==0)
		{
			System.out.println(num);
		}
		
	}
	
}



public class isEvenOrOdd
{
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<>();
		v.add(30);
		v.add(9);
		v.add(2);
		v.add(35);
		v.add(36);
		v.add(38);
	v.forEach(Even::isEven);

		
	}

}
















