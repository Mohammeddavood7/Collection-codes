package com.may15.methodreference;

import java.util.Arrays;

record Person(String name)
{
	public int comparing(Person person)
	{
		return Person.this.name.compareTo(person.name);
	}
}

public class ArraysMethodreference
{
	public static void main(String[] args) 
	{
		
		Person person [] = {new Person("B"),new Person("D"),new Person("C"),new Person("A")};
		
		Arrays.sort(person,  Person::comparing);
		String[] stringArray = new String[4];
		int i = 0;
		for (Person per : person)
		{
			String name = per.name();
			stringArray[i++] = name;
		}
		
		for(String str : stringArray)
		{
			System.out.printf("%-5s",str);
		}
	}

}




















