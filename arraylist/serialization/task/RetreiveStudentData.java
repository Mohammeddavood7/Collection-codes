
package com.arraylist.serialization.task;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RetreiveStudentData 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		var fis = new FileInputStream("D:\\FileHandlingFolder\\ArrayList_Student.txt");
		@SuppressWarnings("resource")
		var ois = new ObjectInputStream(fis);
		
	
		
		@SuppressWarnings("unchecked")
		ArrayList<ArrayList_Student> al	 = (ArrayList<ArrayList_Student>)ois.readObject();
	      System.out.println(al);
	}

}








































