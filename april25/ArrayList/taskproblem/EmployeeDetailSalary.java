package com.april25.ArrayList.taskproblem;

public class EmployeeDetailSalary
{
	private int eId;
	private String eName;
	private double eSalary;
	private float eExpierience;
	public EmployeeDetailSalary() {
		super();
	}
	public EmployeeDetailSalary(int eId, String eName, double eSalary, float eExpierience) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eExpierience = eExpierience;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public float geteExpierience() {
		return eExpierience;
	}
	public void seteExpierience(float eExpierience) {
		this.eExpierience = eExpierience;
	}
	@Override
	public String toString() {
		return "EmployeeDetailSalary [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eExpierience="
				+ eExpierience + "]";
	}
	
	

}
