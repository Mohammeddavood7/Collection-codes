package com.april25.ArrayList.taskproblem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetailSalaryTester 
{
	public static void main(String[] args)
	{
		EmployeeDetailSalary eds1 = new EmployeeDetailSalary(111, "smith",60000, 11);
		EmployeeDetailSalary eds2 = new EmployeeDetailSalary(222, "scott",40000, 9);
		EmployeeDetailSalary eds3 = new EmployeeDetailSalary(333, "ward",55000, 13);
		EmployeeDetailSalary eds4 = new EmployeeDetailSalary(444, "miller",34000, 4);
		EmployeeDetailSalary eds5 = new EmployeeDetailSalary(555, "willsmith",50000, 12);

		
		List<EmployeeDetailSalary> al = new ArrayList<>();
		
		al.add(eds1);
		al.add(eds2);
		al.add(eds3);
		al.add(eds4);
		al.add(eds5);
		System.out.println("Before Updating Salaries: ");
		for(EmployeeDetailSalary e : al)
		{
			System.out.println(e);
		}
		System.out.println("---------------------------------------------");

		System.out.println("After Updating Salaries: ");

		
		for(EmployeeDetailSalary e : UpdateEmployeeSalary.getEmployeeData(al))
		{
			System.out.println(e);
		}

		
	}

}
