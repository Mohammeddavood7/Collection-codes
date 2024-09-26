package com.may10.StreamApi;

import java.util.stream.Stream;

public class ConverteUpcase
{
	public static void main(String[] args)
	{
		Stream<String> of = Stream.of("hello","hi","welcome");
	    of.map(m->m.toUpperCase()).forEach(System.out::println);
	}

}
