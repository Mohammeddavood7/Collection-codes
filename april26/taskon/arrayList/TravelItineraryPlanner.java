package com.april26.taskon.arrayList;

import java.util.List;
import java.util.Scanner;
public class TravelItineraryPlanner
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ItineraryPlanner itineraryPlanner = new ItineraryPlanner();
       
        
        while(true)
        {
        	
        	System.out.println("Choose Options: ");
        	System.out.println("1.Destination ");
        	System.out.println("2.Retrieve Data");
        	System.out.println("3.Exit");
        	System.out.print("Enter the choosen option: ");
            int op = sc.nextInt();
        	 
            switch(op)
            {
            case 1: 
            	    System.out.print("enter the destination: ");
            	    String destination = sc.nextLine();
            	    destination = sc.nextLine();
            	    Destination d1 = new Destination(destination);
            	    System.out.print("enter the how many activities: ");
            	    int countActivities = sc.nextInt();
            	    for(int i = 1 ; i <= countActivities ; i++)
            	    {
            	    	System.out.print("enter Area name: ");
            	    	String area = sc.nextLine();
            	    	area = sc.nextLine();
            	    	System.out.print("enter schedule(morning/evening): ");
            	    	String schedule = sc.nextLine();
                       d1.addActivity(new Activity(area,schedule));
            	    }
            	    itineraryPlanner.addDestination(d1);
            	    break;
            case 2: List<Destination> destinations =  itineraryPlanner.getDestinations();
		            for (Destination dest : destinations)
		            {
		                System.out.println(dest.toString());
		            }
		            break;

            case 3: System.exit(0); break;
           default: System.err.println("invalid option , please check"); break;

             
            }
        	
        	
        	
        }
        
    }
    
}







