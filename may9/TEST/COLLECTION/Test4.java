package com.may9.TEST.COLLECTION;
import java.util.*;

public class Test4 
{
	
	
	
	public static void reArrange(ArrayList<Integer> list) 
	{
        int n = list.size();

        Collections.sort(list);

        int left = 0, right = n - 1;

        ArrayList<Integer> temp = new ArrayList<>(n);

        while (left <= right)
        {
            if (left != right)
            {
                temp.add(list.get(left)); 
                temp.add(list.get(right)); 
            }
            else 
            {
                temp.add(list.get(left)); 
            }
            
            left++;
            right--;
        }

        for (int i = 0; i < n; i++)
        {
            list.set(i, temp.get(i));
        }
    }
	
	
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(6);
        list.add(4);

        reArrange(list);
        
        System.out.println(list);
    }

    
}
