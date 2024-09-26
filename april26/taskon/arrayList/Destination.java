package com.april26.taskon.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Destination 
{
	private String destName;
	private List<Activity> activity;
	public Destination(String destName) {
		super();
		this.destName = destName;
		this.activity = new ArrayList<>();
	}
	
   

   

    public void addActivity(Activity activity) {
        this.activity.add(activity);
    }




	public String getDestName() {
		return destName;
	}




	public void setDestName(String destName) {
		this.destName = destName;
	}




	public List<Activity> getActivity() {
		return activity;
	}




	public void setActivity(List<Activity> activity) {
		this.activity = activity;
	}

	
	  @Override
	    public String toString() {
	        StringBuilder stringBuilder = new StringBuilder();
	        stringBuilder.append("Destination: ").append(this.destName).append("\n");
	        for (Activity activity : activity) {
	            stringBuilder.append(activity.toString()).append("\n");
	        }
	        return stringBuilder.toString();
	    }
	
	
    

	
	
	

}
