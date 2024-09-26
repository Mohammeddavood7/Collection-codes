package com.arraylist.serialization.task;

import java.util.ArrayList;
import java.util.List;
//
//public class Duplicates
//{
//	List<Integer> numberList;
//
//	public List<Integer> getNumberList() {
//		return numberList;
//	}
//
//	public void setNumberList(List<Integer> numberList) {
//		this.numberList = numberList;
//	}
//
//	public Duplicates() {
//		super();
//	}
//
//	public Duplicates(List<Integer> numberList) {
//		super();
//		this.numberList = numberList;
//	}
//	
//	public List<Integer> getDuplicatesList()
//	{
//		List<Integer> la = new ArrayList<>();
//		
//		numberList = new ArrayList<>();
//		
////		numberList.add(33);
////		numberList.add(45);
////		numberList.add(67);
////		numberList.add(89);
////		numberList.add(33);
////		numberList.add(47);
////		numberList.add(21);
////		numberList.add(45);
//		
//		int incr = 0;
//		numberList.add(66);
//		numberList.add(66);
//		numberList.add(77);
//		numberList.add(66);
//		numberList.add(66);
//		
//		
//		
//		if(numberList == null )
//		{
//			return null;
//		}
//		else if(numberList.isEmpty())
//		{
//			return null;
//		}
//		else
//		{
//			for (int i = 0 ; i < numberList.size();i++)
//			{
//				for (int j = i+1 ; j < numberList.size() ; j++)
//				{
//					if(numberList.get(i) == numberList.get(j))
//					{
//						       if (!la.contains(i)) 
//					            {
//					                la.set(incr++,numberList.get(i));
//					                break;
//					            } 
//						}
//					
//				}
//				
//			}
//		
//			return la;
//		}
//	}
//	
//	public static void main(String[] args) 
//	{
//		Duplicates dup = new Duplicates();
//		List<Integer> li = dup.getDuplicatesList();
//		System.out.println(li);
//		
//	}
//}

public class Duplicates
{
    private List<Integer> numberList;

    public List<Integer> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public Duplicates() {
        super();
    }

    public Duplicates(List<Integer> numberList) {
        super();
        this.numberList = numberList;
    }

    public List<Integer> getDuplicatesList() {
        if (numberList == null || numberList.isEmpty()) {
            return null;
        }

        List<Integer> duplicates = new ArrayList<>();
        List<Integer> unique = new ArrayList<>();
        // 66,66,77,66,66
        
        for (Integer num : numberList)
        {
            if (!unique.contains(num)) 
            {
                unique.add(num);
            }
            else if (!duplicates.contains(num))
            {
                duplicates.add(num);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        // Test case
        List<Integer> numbers = new ArrayList<>();
//        numbers.add(66);
//        numbers.add(66);
//        numbers.add(77);
//        numbers.add(66);
//        numbers.add(66);
//        numbers.add(66);
        
        numbers.add(33);
        numbers.add(45);
        numbers.add(67);
	    numbers.add(89);
	    numbers.add(33);
	    numbers.add(45);
	    numbers.add(21);


        

        Duplicates duplicates = new Duplicates(numbers);
        List<Integer> duplicatesList = duplicates.getDuplicatesList();
        System.out.println("Duplicates in the list: " + duplicatesList);
    }
}


























































