package com.may10.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Emp(String name,Integer id,Double sal) {

	public Object stream() {
		// TODO Auto-generated method stub
		return null;
	}}



public class Employee
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp("A",111,33000.0);
		Emp e2 = new Emp("B",222,25000.0);
		Emp e3 = new Emp("C",333,56000.0);
		Emp e4 = new Emp("D",444,67000.0);
		Emp e5 = new Emp("E",555,23000.0);
		Emp e6 = new Emp("F",666,35000.0);
		List<Emp> of =Arrays.asList(e1,e2,e3,e4,e5,e6);
	    //of.stream().filter(e -> e.sal() < 30000).forEach(System.out::println);
	  
	    
	    
	    Stream<List<Emp>> emp = Stream.of(of);
	    List<Emp> collect = emp.flatMap(emp1 -> emp1.stream()).collect(Collectors.toList());
	    
	    System.out.println(collect);
	    
	    
		}
	

}
