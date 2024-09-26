package com.arraylist_linkedList.task.april23;

import java.util.ArrayList;

public class MergeData {

	public static void main(String[] args)
	{
		ArrayList<String> fruit1 = new ArrayList<>();
        fruit1.add("mango");
        fruit1.add("apple");
        fruit1.add("banana");
        fruit1.add("guava");
        fruit1.add("grapes");
        fruit1.add("jackfruit");
        
        ArrayList<String> fruit2 = new ArrayList<>();
        fruit2.add("watermelon");
        fruit2.add("kiwi");
        fruit2.add("dragonfruits");
        fruit2.add("promogranet");
        
        fruit1.addAll(fruit2);
        
        System.out.println("After Merging Data: ");
        fruit1.forEach(ft -> System.out.println(ft.toUpperCase()));        

	}

}
