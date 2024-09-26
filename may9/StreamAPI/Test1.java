package com.may9.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 
{
	public static void main(String[] args) 
	{
		
		
		List<Integer> list1 = List.of(4,77,8,9,22,22,46,66);
		List<Integer> list2 = List.of(3,2,4);

		
		Set<Integer> collect = list1.stream().filter(en -> en%2==0).collect(Collectors.toSet());
		collect.forEach(System.out::println);
		collect.stream().map(m -> m*m*m).forEach(System.out::println);
		
		
		List<List<Integer>> fm = List.of(list1,list2);
        List<Integer> fmm = fm.stream().flatMap(f->f.stream()).collect(Collectors.toList());
	    System.out.println(fmm);
	    
	    
	    List<Integer> asList = Arrays.asList(2,4,6,8,10);
	    Stream<List<Integer>> of = Stream.of(asList);
	    of.forEachOrdered(ev -> System.out.print(ev));
	    
	    
	}

}




























