package com.april25.SetInterface;

import java.util.Stack;

public class DemoStackClass 
{
	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<>();
		s.push(1);//5 //0
		s.push(2);//4  //1
		s.push(3);//3  //2
		s.push(4);//2 //3
		s.push(5);//1 //4
		              //5
		
//		   System.out.print(s.pop()+" ");
//		   System.out.print(s.pop()+" ");
//		   System.out.print(s.pop()+" ");
//		   System.out.print(s.pop()+" ");
//		   System.out.print(s.pop()+" ");
		for(int i = 0 ; i < s.size() ; i++)
		{
           System.out.println(s.peek());
		}
		
         //System.out.println(s.search(2));
		//s.forEach(rs -> System.out.println(rs));

		
		
	}

}
