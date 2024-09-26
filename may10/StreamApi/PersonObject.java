package com.may10.StreamApi;

import java.util.Arrays;
import java.util.List;

record Person(String name,Integer Id)
{
	
}

public class PersonObject 
{
	public static void main(String[] args) 
	{
		Person person = new Person("Abu",45);
		Person person2 = new Person("Abu",5);
		Person person3 = new Person("Abu",7);
		Person person4 = new Person("Abu",4);
		List<Person> asList = Arrays.asList(person,person2,person3,person4);
		asList.stream().sorted((p,q) -> p.Id()-q.Id()).forEach(System.out::println);
		
		
	}

}

























