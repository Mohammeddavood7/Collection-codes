package com.may9.TEST.COLLECTION;
import java.util.ArrayList;
import java.util.List;

class ListOperations 
{
    public static List<String> union(List<String> list1, List<String> list2)
    {
        List<String> union = new ArrayList<>(list1);
        union.addAll(list2);
        return union;
    }

    public static List<String> intersection(List<String> list1, List<String> list2) 
    {
        List<String> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        return intersection;
    }

    public static List<String> difference(List<String> list1, List<String> list2) 
    {
        List<String> difference = new ArrayList<>(list1);
        difference.removeAll(list2);
        return difference;
    }
}

public class ListTester {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Ram");
        list1.add("Mayank");
        list1.add("Radha");
        list1.add("Pawan");

        List<String> list2 = new ArrayList<>();
        list2.add("Ram");
        list2.add("Arjun");
        list2.add("Pawan");
//        list2.add("Arjun");

        System.out.println("union: ");
        System.out.println( ListOperations.union(list1, list2));
        System.out.println("------------------------------");
        System.out.println("intersection:");
        System.out.println("------------------------------");

        System.out.println( ListOperations.intersection(list1, list2));
         System.out.println("difference:");
         System.out.println("------------------------------");

        System.out.println( ListOperations.difference(list1, list2));
    }
}
