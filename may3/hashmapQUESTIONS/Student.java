package com.may3.hashmapQUESTIONS;

import java.util.HashMap;
import java.util.Scanner;

public class Student 
{
	static Scanner sc = new Scanner(System.in);
    HashMap<String,Integer> gradebook = new HashMap<>();

	public boolean addStudent(String name,Integer grade)
	{
	     return null == gradebook.put(name, grade);
	   
	 }
	
	
	
	public void removeStudent()
	{
		System.out.println(gradebook.isEmpty() ? "no students and grades to display":"Choose:   ");
		System.out.print("enter the student name to remove");
		String name = sc.nextLine();
		name = sc.nextLine();
		Integer r = gradebook.remove(name);
		System.out.println(r != null ? "student grade romoved successfully":"not student grade romoved successfully");
	}
	
	public void display()
	{
		gradebook.forEach((r,n)->System.out.println(r+"  =  "+n));
		
	}
	
	
	public static void main(String[] args)
	{
		Student stud = new Student();

		while(true)
		{
			System.out.println("1.Add Student Grade");
			System.out.println("2.Remove Student Grade");
			System.out.println("3.Display details");
			System.out.println("4.Exit");

            System.out.print("choose option: ");
            int op = sc.nextInt();
            switch(op)
            {
              case 1:  
            	  
            	      System.out.print("enter the student name: ");
                      String name = sc.nextLine();
                      name = sc.nextLine();
                      System.out.print("enter the student grade: ");
                      Integer grade = sc.nextInt();
            	      System.out.println(stud.addStudent(name, grade) ? " grade has been added for the student.":" grade has been not added for the student.");
            	      break;
              case 2: stud.removeStudent(); break;
              case 3: stud.display(); break;
              case 4: System.exit(0); break;
              default : System.out.println("invalid option");
            }
            
            
            
            
            
            
            
			
		}
	}

}


























