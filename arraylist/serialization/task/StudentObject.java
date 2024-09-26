package com.arraylist.serialization.task;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentObject 
{
	public static void main(String[] args) throws IOException
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("how many object you need to create ? : ");
		int num = sc.nextInt();
		
		FileOutputStream fos =  new FileOutputStream("D:\\FileHandlingFolder\\ArrayList_Student.txt",true);
		var oos = new ObjectOutputStream(fos);
		
		ArrayList<ArrayList_Student> al = new ArrayList<>()	;
		
		try(sc;fos;oos)
		{

			for (int i = 1 ; i <= num ; i++)
			{
				ArrayList_Student studentObject = ArrayList_Student.getStudentObject();	
				al.add(studentObject);
			}
			oos.writeObject(al);
			System.out.println("object are successfully stored into files");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
