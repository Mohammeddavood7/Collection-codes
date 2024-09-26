package com.arraylist.classnotes;

public class HasRelationOnProffosser_Department 
{
	public static void main(String[] args) 
	{
		Proffosser p1 = new Proffosser("smith", "java");
		Proffosser p2 = new Proffosser("scott",  "python");
		Proffosser p3 = new Proffosser("smith", ".net");
		
		Department d = new Department("computer science");
		d.getProffosser().add(p1);
		d.getProffosser().add(p2);
		d.getProffosser().add(p3);
		
		System.out.println("department: "+d.getDapartmentName());
		
		d.getProffosser().forEach(prof -> System.out.println("proffoser: "+prof.getName()+" : "+"specialization: "+prof.getSpecialization()));
		
		
	

		
	}

}
