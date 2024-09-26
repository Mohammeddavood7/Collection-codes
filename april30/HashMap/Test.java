package com.april30.HashMap;

//public class Test 
//{
//      public static void main(String[] argv) 
//      {
//           TreeSet set = new TreeSet();
//           for (int i = 0; i < 5; i++)
//                set.add(Math.random());
//
//           Iterator iter = set.iterator();
//           while (iter.hasNext())
//              System.out.println(iter.next());
//
//     }
//}

//public class Test
//{
//       public static void main(String[] args) 
//       {
//            TreeSet<Integer> times = new TreeSet<Integer>();
//            times.add(1205);
//            times.add(1505);
//            times.add(1545);
//            times.add(1830);
//            times.add(2010);
//            times.add(2100);
//    
//            TreeSet<Integer> subset = new TreeSet<Integer>();
//            subset = (TreeSet) times.headSet(1600);
//            System.out.println(subset);
//            System.out.println(subset.first());
//            System.out.println(subset.last());
//            System.out.println(subset.lower(1500));
//            System.out.println(subset.higher(1500));
//            
//            
//       }
//}

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class GenreSort implements Comparator<Movie> 
//{
//     public int compare(Movie one, Movie two) 
//     {
//           return one.getGenre().compareTo(two.getGenre());
//     }
//}
//class Movie implements Comparable<Movie> 
//{
//     String title;
//     String genre;
//     String leadActor;
//     Movie(String t, String g, String a) 
//     {
//           title = t;
//           genre = g;
//           leadActor = a;
//     }
//     public String toString() 
//     {
//           return title + " " + genre + " " + leadActor + "\n";
//     }
//     @Override
//     public int compareTo(Movie d) 
//     {
//           return title.compareTo(d.getTitle());
//     }
//     public String getTitle() 
//     {
//           return title;
//     }
//     public String getGenre() 
//     {
//           return genre;
//     }
//     public void setGenre(String genre) 
//     {
//           this.genre = genre;
//     }
//}
//public class Test 
//{
//     public static void main(String[] args) 
//     {
//    	 
//           ArrayList<Movie> dvdlist = new ArrayList<Movie>();
//           System.out.println(dvdlist);
//           dvdlist.add(new Movie("a","a","a"));
//           dvdlist.add(new Movie("b","b","b"));
//           dvdlist.add(new Movie("c","c","c"));
//
//           Collections.sort(dvdlist);
//           System.out.println(dvdlist); 
//           
//           GenreSort gs = new GenreSort();
//           
//           Collections.sort(dvdlist, gs);
//           System.out.println(dvdlist); 
//     }
//}

//import java.util.HashSet;
//public class Test
//	 {
//
//             public static void main(String[] args)
//			  {
//              Integer a = new Integer(4);
//              Integer b = new Integer(8);
//              Integer c = new Integer(4);
//              
//              HashSet hs = new HashSet();
//              hs.add(a);
//              hs.add(b);
//              hs.add(c);
//              System.out.println(hs);
//             }
//        }

/*import java.util.HashSet;
public class Test
{
	private String a;
	public Test(String a) 
	{
	this.a = a; 
	}
	public static void main(String[] args) 
	{

	HashSet<Object> hash = new HashSet<Object>();
	Test ms1 = new Test("MarutiCurvo");
	Test ms2 = new Test("MarutiCurvo");
	String a1 = new String("MarutiCurvo");
	String a2 = new String("MarutiCurvo");
	hash.add(ms1); 
	hash.add(ms2); 
	hash.add(a1); 
	hash.add(a2);
	System.out.println(hash.size()); 
    }
}*/

/*import java.util.SortedSet;
import java.util.TreeSet;
class  Test
{
	public static void main(String[] args) {
    SortedSet<Integer> set = new TreeSet<Integer>();
    set.add(7);
    set.add(-12);
    SortedSet<Integer> sub = set.subSet(-100, 100);
    System.out.println(sub);
    sub.add(9);
    
    System.out.format("%d %d", set.size(), sub.size());
    System.out.println(set);
}
}

//-12,7
//3,3*/

/*import java.util.NavigableSet;
import java.util.TreeSet;
class Test 
{
	public static void main(String[] args) {
    NavigableSet<Integer> set = new TreeSet<Integer>();
    set.add(-12);
    set.add(24);
    System.out.format("%d %d %d %d",
        set.lower(-12),
        set.lower(0),
        set.lower(24),
        set.lower(100)
    );
}
}

//null,-12,-12,24
*/

/*
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
class Test
{
    public static void main(String[] args) 
    {
    NavigableSet<Integer> set = new TreeSet<Integer>();
    set.add(1);
    set.add(2);
    set.add(4);
    for (Iterator<Integer> iterator = set.descendingSet().iterator();iterator.hasNext();) 
    {
        System.out.format("%d ", iterator.next());
    }
}
}
*/

/*import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test 
{
      public static void main(String[] argv) 
      {
            Set set = new TreeSet();
            set.add("2");
            set.add(3);
            set.add("1");
            Iterator it = set.iterator();
            while (it.hasNext())
                 System.out.print(it.next() + " ");
      }
}
*/
//import java.util.HashSet;
//import java.util.Iterator;
//public class Test 
//{
//       public static void main(String args[]) 
//       {
//            HashSet set = new HashSet();
//            String s1 = "abc";
//            String s2 = "def";
//            String s3 = "";
//            set.add(s1);
//            set.add(s2);
//            set.add(s1);
//            set.add(s2);
//            Iterator i = set.iterator();
//            while(i.hasNext())
//            {
//                 s3 += (String) i.next();
//            }
//            System.out.println(s3);
//       }
//}







