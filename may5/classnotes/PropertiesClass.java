package com.may5.classnotes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass
{
	public static void main(String[] args) throws FileNotFoundException
	{
		FileReader fr = new FileReader("D:\\FileHandling25\\database.properties");
		Properties p = new Properties();
	    try 
	    {
			p.load(fr);
			System.out.println(p.getProperty("driver"));
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));
			
			System.out.println();

			
		}
	    catch (IOException e) 
	    {
			e.printStackTrace();
		}
		
	}

}



















