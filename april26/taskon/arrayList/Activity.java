package com.april26.taskon.arrayList;

public class Activity 
{
	private String name;
	private String schedule;
	public Activity(String name, String schedule) {
		super();
		this.name = name;
		this.schedule = schedule;
	}
	public Activity() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "Activity [name=" + name + ", schedule=" + schedule + "]";
	}
	
	
	

}
