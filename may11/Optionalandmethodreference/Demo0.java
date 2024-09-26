package com.may11.Optionalandmethodreference;

interface Test
{
	//void work();
	Test working();
}
class Emp implements Test
{
	//
	//	@Override
	//	public void work() 
	//	{
	//		System.out.println("Emp work method");
	//	}

	
	public Test working()
	{
		return new Emp();
	}
	
}

/*class Employee 
{
	public static void work()
	{
		System.out.println("employee is working");
	}
	
}*/

public class Demo0 
{
	public static void main(String[] args) 
	{
		
//	   Test t = ()-> System.out.println("hello");
//	   t.work();
	   
//	   Test t1 = new Employee()::work;
//	   t1.work();
//	   
//	   Test t2 = Employee::work;
	   
	   Test t3 = Emp::new;
	   System.out.println(t3.working());
	   
	   
	   
		
	}

}




















