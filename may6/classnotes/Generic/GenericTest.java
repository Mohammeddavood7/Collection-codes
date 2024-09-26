package com.may6.classnotes.Generic;

/*class Test<R,A>
{
	private R r;
	private A a;
	public void set(A a, R r) //method 
	{
		this.a = a;
		this.r = r;
	}
	
	public String get() 
	{
		String str = a+" "+r;
		return str;
	}
}

public class GenericTest 
{
  public static void main(String[] args) 
  {

		  Test<String,String> test = new Test(); 
		  test.set("Naresh I ","Technologies");
		  System.out.println(test.get()); 
  }
}*/



public class GenericTest{
	public static void main(String[] args) {
		System.out.println(display(1));
		System.out.println(display("NareshIT"));
		System.out.println(display(3.25f));
		
	}
	public static<E> E display(E element)
	{
		E e = element;
		return e;
	}
}

