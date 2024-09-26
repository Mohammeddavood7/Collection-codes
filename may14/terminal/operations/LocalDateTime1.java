package com.may14.terminal.operations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime1
{
	public static void main(String[] args)
	{
		LocalTime lt = LocalTime.now();
		//System.out.println(lt);
		LocalDate ld = LocalDate.now();
		//System.out.println(ld);
		
		LocalDateTime ldt = LocalDateTime.now();
		//System.out.println(ldt);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd:MM:YYYY  HH:mm:ss");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        
		LocalDateTime now = LocalDateTime.now();
		
		String format = now.format(dtf1);
		System.out.println(format);
		/*  System.out.println("------------------------------");
		String format1 = now.format(dtf2);
		System.out.println(format1);
		System.out.println("------------------------------");
		
		LocalDateTime of = LocalDateTime.of(ld,lt);
		System.out.println(of);*/
	}


}


















