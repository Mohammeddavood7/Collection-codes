package com.may5.classnotes;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class GetPropertiesClass
{
	public static void main(String[] args)
	{
		Properties prop = System.getProperties();
		prop.forEach((r,n)-> System.out.println(r+" = "+n));
		System.err.println("--------------------------------------");
		Set<Entry<Object, Object>> es = prop.entrySet();
		Iterator<Entry<Object, Object>> it = es.iterator();
		while(it.hasNext())
		{
			Entry<Object, Object> next = (Entry<Object, Object>)it.next();
			System.out.println(next);
		}
		
	}

}