package com.april25.ArrayList.taskproblem;

import java.util.List;

public class UpdateEmployeeSalary
{
	public static List<EmployeeDetailSalary> getEmployeeData(List<EmployeeDetailSalary> eds)
	{
		for(EmployeeDetailSalary e : eds)
		{
			if(e.geteSalary() > 50000 && e.geteExpierience() > 10)
			{
				e.seteSalary(e.geteSalary() * 2);
			}
			
		}
		
		return eds;
	}

}
