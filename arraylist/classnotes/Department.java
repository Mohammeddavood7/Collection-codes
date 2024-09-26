package com.arraylist.classnotes;

import java.util.ArrayList;
import java.util.List;

public class Department 
{
	private String dapartmentName;
	private List<Proffosser> proffosser;
	public Department(String dapartmentName) {
		super();
		this.dapartmentName = dapartmentName;
		this.proffosser = new ArrayList<Proffosser>();
	}
	public String getDapartmentName() {
		return dapartmentName;
	}
	public void setDapartmentName(String dapartmentName) {
		this.dapartmentName = dapartmentName;
	}
	public List<Proffosser> getProffosser() {
		return proffosser;
	}
	public void setProffosser(List<Proffosser> proffosser) {
		this.proffosser = proffosser;
	}
	
	
	
	
	
	

}
