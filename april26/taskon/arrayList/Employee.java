package com.april26.taskon.arrayList;

public class Employee 
{
	private String name;
	private String position;
	private double salary;
	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	

}














