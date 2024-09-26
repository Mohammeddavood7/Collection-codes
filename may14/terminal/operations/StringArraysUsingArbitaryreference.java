package com.may14.terminal.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StringArraysUsingArbitaryreference 
{
	public static void main(String[] args) 
	{
	  List<String> str =  Arrays.asList("Array","Binary","Class","Dictionary");
	  String string[] = str.stream().toArray(String[]::new);
	  System.out.println(Arrays.toString(string));
	   
	  System.out.println("---------------------------");
	    List<Integer> num = Arrays.asList(1,5,8,3,9,4);
	  Optional<Integer> min = num.stream().reduce(Integer::min);
	  System.out.println(min);
	  System.out.println("-----------------------------------");
	  List<Integer> num1 = Arrays.asList(1,2,3,4,5,6);
	  Optional<Integer> max = num1.stream().reduce(Integer::max);
	  System.out.println(max);
	  System.out.println("=================================");
	  List<Integer> num2 = Arrays.asList(1,2,3,4,5,6);
	  Optional<Integer> sum = num2.stream().reduce((a,b)->a+b);
	  System.out.println(sum);
	  
	  System.out.println("-----------------------------------------");
	  List<Integer> num3 = Arrays.asList(1,2,3,4,5,6);
	  Integer sum1 = num3.stream().reduce(0,(a,b)->(a+b));
	  System.out.println(sum1);
	  System.out.println("-----------------------------------------");
      List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
      Integer reduce = asList.stream().reduce(1,(a,b)->(a*b));
      System.out.println(reduce);
      System.out.println("------------------------------");
      Optional<Integer> reduce2 = Stream.of(1,3,5,6).reduce(Integer::sum);
      System.out.println(reduce2);
	}

}




















