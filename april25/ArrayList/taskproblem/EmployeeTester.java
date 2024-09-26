package com.april25.ArrayList.taskproblem;

import java.util.ArrayList;
import java.util.List;

class EmployeeDetails
{
	private String empName;
	private int empId;
	
	
EmployeeDetails(String empName,int empId)
{
	this.empName = empName;
	this.empId = empId;
	
}




	public String getEmpName() {
	return empName;
}




public void setEmpName(String empName) {
	this.empName = empName;
}




public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
	public static void getEmpData(List<EmployeeDetails> al)
	{
		List<String> e1 = new ArrayList<>();
		List<Integer> e2 = new ArrayList<>();


		
		for(EmployeeDetails ed : al)
		{
			int id = ed.getEmpId();
			String name = ed.getEmpName();
			
			
			if(Character.isAlphabetic(name.charAt(0)));
			{
				e1.add(name);	
			}
			if(Character.isDigit(id));
			{
				e2.add(id);
			}
			
			
			/*if(Integer.valueOf(id) instanceof Integer)
			{
				e2.add(id);
			}
			else if(name instanceof String)
			{
				e1.add(name);
				
			}
			*/
			
		}
		
		System.out.println(e1);
		System.out.println(e2);
		
	}
	
}


public class EmployeeTester 
{
	
	public static void main(String[] args) 
	{
		EmployeeDetails e1 = new EmployeeDetails("smith",111);
		EmployeeDetails e2 = new EmployeeDetails("scott",222);
		EmployeeDetails e3 = new EmployeeDetails("ward",333);
		EmployeeDetails e4 = new EmployeeDetails("miller",444);


		List<EmployeeDetails> al = new ArrayList<>();		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		
	
	   EmployeeDetails.getEmpData(al);
		
		
	}

}
