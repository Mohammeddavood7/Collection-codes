package com.april30.HashMap;

import java.io.Serializable;

public class SerializableClass implements Serializable
{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Double sal;
	public SerializableClass(Integer id, String name, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "SerializableClass [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
