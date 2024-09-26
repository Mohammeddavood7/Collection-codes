package com.april29.classtask;

import java.util.Comparator;
import java.util.TreeSet;

record Employee(Integer eid,String ename,Double esalary) {

}
class Comp implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		return o2.eid() - o1.eid();
	}
	
}


public class TreeSetConstructotAcceptComparator
{
	public static void main(String[] args)
	{
		
		TreeSet<Employee> ts = new TreeSet<>(new Comp());
		ts.add(new Employee(111,"American",694.0));
		ts.add(new Employee(555,"Cilian",654.0));
		ts.add(new Employee(333,"Dolly",647.0));
		ts.add(new Employee(222,"BennyScot",674.0));
		ts.add(new Employee(444,"Emila",678.0));
		System.err.println("descending id order");
		ts.forEach(r->System.out.println(r));
		System.out.println();
		
		
		TreeSet<Employee> ts1 = new TreeSet<>((i1,i2)-> i1.eid() -i2.eid());
		ts1.add(new Employee(111,"American",694.0));
		ts1.add(new Employee(555,"Cilian",654.0));
		ts1.add(new Employee(333,"Dolly",647.0));
		ts1.add(new Employee(222,"BennyScot",674.0));
		ts1.add(new Employee(444,"Emila",678.0));
		System.err.println("Asscending id order");
		ts1.forEach(r->System.out.println(r));
		
		
		
		TreeSet<Employee> ts2 = new TreeSet<>((i1,i2)-> i1.ename().compareTo(i2.ename()));
		ts2.add(new Employee(111,"American",694.0));
		ts2.add(new Employee(555,"Cilian",654.0));
		ts2.add(new Employee(333,"Dolly",647.0));
		ts2.add(new Employee(222,"BennyScot",674.0));
		ts2.add(new Employee(444,"Emila",678.0));
		System.err.println("Asscending name order");
		ts2.forEach(r->System.out.println(r));
		
		TreeSet<Employee> ts3 = new TreeSet<>((i1,i2)-> i2.ename().compareTo(i1.ename()));
		ts3.add(new Employee(111,"American",694.0));
		ts3.add(new Employee(555,"Cilian",654.0));
		ts3.add(new Employee(333,"Dolly",647.0));
		ts3.add(new Employee(222,"BennyScot",674.0));
		ts3.add(new Employee(444,"Emila",678.0));
		System.err.println("descending name order");
		ts3.forEach(r->System.out.println(r));


		
	}
}




















