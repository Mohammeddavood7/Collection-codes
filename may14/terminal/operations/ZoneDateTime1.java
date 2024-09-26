package com.may14.terminal.operations;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTime1 
{
	public static void main(String[] args) 
	{
		 ZonedDateTime now = ZonedDateTime.now();
		 //System.out.println(now);
		 ZoneId id = now.getZone();
		 //System.out.println(id);
		 //System.out.println("_--------------------------------_");
		 Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		// System.out.println(availableZoneIds);
		 System.out.println("_--------------------------------_");
		 
		 ZoneId of = ZoneId.of("Europe/London");
		 ZonedDateTime now2 = ZonedDateTime.now(of);
		 System.out.println(now2);
		
		 
	}

}

















