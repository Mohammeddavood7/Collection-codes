package com.arraylist.serialization.task;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class ArrayList_Student implements Serializable	
{
	private static final long serialVersionUID = 1L;
	
	static Scanner sc = new Scanner(System.in);
	private int studentId;
	private String studentName;
	private double studentFees;
	private Date dateOfAdmission;
	
	
	
	
	
	public static Scanner getSc() {
		return sc;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public double getStudentFees() {
		return studentFees;
	}

	public Date getDateOfAdmission() {
		return dateOfAdmission;
	}

	public ArrayList_Student(int studentId, String studentName, double studentFees, Date dateOfAdmission)
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static ArrayList_Student getStudentObject()
	{
		System.out.print("enter student id: ");
		int id = sc.nextInt();
		System.out.print("enter student name: ");
		String name = sc.next();
		System.out.print("enter student fees: ");
		double fees = sc.nextDouble();
		Date date = new Date();
		return new ArrayList_Student(id, name, fees, date);
	}
     
	@Override
	public String toString() {
		return "ArrayList_Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees="
				+ studentFees + ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	
	
	
	
	
	
	
}

