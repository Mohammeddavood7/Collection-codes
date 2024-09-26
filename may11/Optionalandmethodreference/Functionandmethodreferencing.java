package com.may11.Optionalandmethodreference;

import java.util.function.Function;

class Myclass
{
	int val ;
	public Myclass(int val)
	{
		this.val = val;
		
	}
	
	public int getVal()
	{
		return val;
	}
}


public class Functionandmethodreferencing
{
	public static void main(String[] args) 
	{
		Function<Integer,Myclass> fun = Myclass::new;
		
		Myclass val = fun.apply(67);
		System.out.println(val.getVal());
		
	
	}

}


//class MyClass 
//{
//    private int value;
//
//    public MyClass(int value)
//    {
//        this.value = value;
//    }
//
//    public int getValue() 
//    {
//        return this.value;
//    }
//}
//
//public class ConstructorReferenceDemo2 
//{
//    public static void main(String[] args) 
//    {
//        Function<Integer, MyClass> constructorRef = MyClass::new;
//                                  
//
//     MyClass apply = constructorRef.apply(15);
//
//        System.out.println("Value: " + apply.getValue());
//    }
//}



















