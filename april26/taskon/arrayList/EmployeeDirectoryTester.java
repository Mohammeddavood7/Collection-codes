package com.april26.taskon.arrayList;

import java.util.Scanner;

public class EmployeeDirectoryTester
{
	static Scanner sc = new Scanner(System.in);

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable
	{
		sc.close();
		super.finalize();
	}
	public static void main(String[] args) 
	{
		Directory d = new Directory();
		
		while(true)
		{
			System.out.println("Choose Option: ");
			System.out.println("1. Add Employee Object");
			System.out.println("2. Display Employee Object");
			System.out.println("3. Update Employee Object");
			System.out.println("4. Delete Employee Object");
			System.out.println("5. Exit");
			System.out.print("Enter the choosen option : ");
			int c = sc.nextInt();
			
		   switch(c)
		   {
		    case 1 : d.addEmployee(); System.out.println("employee object added successfully"); break;
		    case 2 : d.displayAllEmployee(); break;
		    case 3 : 
			    	System.out.print("enter the employee object index to update: ");
			    	int index1 = sc.nextInt();
			    	d.updateEmployee(index1);
			    	break;
		    case 4: 
		    	    System.out.print("enter the employee index: ");
	    	        int index2 = sc.nextInt();
		    	    d.deleteEmployee(index2); 
		    	    break;
		    case 5: System.exit(0); 
		    default : System.out.println("invalid option,please check");
		   }
		  
		
			
		}
		
	}

}

















