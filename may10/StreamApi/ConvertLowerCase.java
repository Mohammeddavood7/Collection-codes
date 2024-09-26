package com.may10.StreamApi;

import java.util.Arrays;
import java.util.List;

public class ConvertLowerCase
{
	public static void main(String[] args) 
	{
		List<String> lower = Arrays.asList("HELLO","hi","welcome","main");
		lower.stream().map(l->l.toLowerCase()).forEach(System.out::println);
	}

}
