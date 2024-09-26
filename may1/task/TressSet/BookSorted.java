package com.may1.task.TressSet;

import java.util.Set;
import java.util.TreeSet;

record Book(String name ,String author) implements Comparable<Book>
{

	@Override
	public int compareTo(Book b)
	{
		return this.name.compareTo(b.name);
	}
	
}


public class BookSorted
{
	public static void main(String[] args)
	{
		Set<Book> ts = new TreeSet<>();
		ts.add(new Book("B","BOB"));
		ts.add(new Book("A","AOA"));
		ts.add(new Book("F","FOF"));
		ts.add(new Book("E","EOE"));
		ts.add(new Book("D","DOD"));

		System.err.println("sorted in alphabetial order");
		ts.forEach(res -> System.out.println(res));

	}
	
}




























