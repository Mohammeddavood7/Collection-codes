package com.forEachMethodandforEachRemaining;

import java.util.StringTokenizer;

/*public class CollectionExample 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		Iterator<String> it = al.iterator();
		
		while(it.hasNext())
		System.out.print(it+" ");
		
	}
}*/

/*public class CollectionExample 
{
	public static void main(String[] args)
        {
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		al.remove(4);
		for(String str: al)
		System.out.print(str+" ");
	}
}*/

/*public class CollectionExample
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList<>();
		al.add(5);
		al.add("");
		al.add(10);
		System.out.println(al.contains(6));
		System.out.println(al.contains(10));
		System.out.println(al.contains(null));
	}
}*/



/*public class CollectionExample 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList<>();
		al.add(50);
		al.add(25);
		ListIterator li = al.listIterator();
		
		while(li.hasNext())
			System.out.println(li.next());
		li.add(22);
		System.out.println(li.hasNext());
	
	}
}*/


/*public class Test
{
     public static void main(String[] argv) 
     {
           Collection c = new ArrayList();
           c.add("1");
           c.add("2");
           c.add("3");
           Collection c1 = new ArrayList();
           c1.add("1");
           c.retainAll(c1);
           System.out.println(c);
     }
}
*/

/*public class Test
{
      public static void main(String[] argv) 
      {
            List<String> list = new ArrayList<String>();
            list.add("a"); //0
            list.add("b"); //1
            list.add("c"); //2
            System.out.println(list.indexOf("a")); 
            System.out.println(list.indexOf("c"));  
            System.out.println(list.indexOf("e")); //
      } // 0 2  
}*/

/*public class Test
{
     public static void main(String[] args)
     {
           Integer int1 = new Integer(10);
           Vector vec1 = new Vector();
           vec1.add(int1);
           LinkedList list = new LinkedList();
           list.add(int1);
           
           if(vec1.equals(list)) 
                System.out.println("equal");
           else  
                System.out.println("not equal");
     }
}*/


/*public class Test
{
       public static void main(String[] args) 
       {
             List<Number> list = new ArrayList<Number>();
             System.out.format("%b %b %b %d",
                 list.add(7),
                 list.add(null),
                 list.add(7),
                 list.size());
       }
}
*/


/*public class Test
{
       public static void main(String[] args) 
       {
            List<Number> list = new ArrayList<Number>();
            list.add(7);
            list.add(8);
            list.add(7);
            Number index = list.get(Integer.valueOf(7));
            System.out.println(index);
        }
}*/



/*public class Test
{
       public static void main(String[] args) 
       {
        List<String> list1 = new ArrayList<String>();
		list1.add("Dohni");
		list1.add("Sahwag");
		list1.add("Bumrah");
		list1.set(0, "Virat");
		list1.add(0, "Rohit");
		System.out.println(list1);
		////rohit,virat,sahwag ,brumrah

       }
}*/


/*public class Test
{
 public static void main(String argv[])
	 {
    	 
    	ArrayList list = new ArrayList(); 
    	ArrayList listStr = list; 
    	ArrayList listBuf = list; 
    	listStr.add(0, "Hello"); 
    	StringBuffer buff =listBuf.get(0); 
       System.out.println(buff.toString());
    }

}*/

/*public class Test
{
public static void main(String... args) 
{
	ArrayList obj = new ArrayList();
            obj.add("A");
            obj.set(0, "B");
            System.out.println(obj.size());
        }
}*/



/*public class Test
{
	public static void main(String[] args) 
	{
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		if(one.equals(two))
		{
		System.out.println("Equal ...");
		}
		else
		{
		System.out.println("Not Equal ...");
		}
	}
}
class Moof
{
	private int moofValue;
	Moof(int val)
	{
		moofValue=val;
	}

	public int getMoofValue()
	{
		return moofValue;
	}
	public boolean equals(Object o)
	{
		if((o instanceof Moof)&&(((Moof)o).getMoofValue()==this.moofValue))
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}*/


/*class Emp 
{
	private int age ;
	
	public Emp( int age )
	{
		super();
		this.age = age;
	}
	
	public int hashCode()
	{
		return age;
	}
}
public class Test
{
	public static void main(String[] args) 
	{
		Emp emp1 = new Emp(23);
		System.out.println("emp1.hashCode() is :"+emp1.hashCode());


		int originalHashCode = System.identityHashCode(emp1);
		System.out.println("Original hashCode of Emp is :"+originalHashCode);
	}
}
*/
/*public class PredicateDemo {

	public static void main(String[] args) 
	{		
		String str = "Hyderabad is an IT city";
		
        StringTokenizer st = new StringTokenizer(str, " ");
        
        System.out.println("Total number of tokens :"+st.countTokens());
        System.out.println("Tokens are :");
        
        while(st.hasMoreTokens())
        {
        	System.out.println(st.nextToken());        	
        }


	}

}*/


public class Test22
{
public static void main(String args[])
	{
		String s1="Hyderabad is a nice city";  
		String [] words = s1.split(" "); //Space is Delimiter
		for(String word : words)
		{
			System.out.println(word);
		}       
	    System.out.println("..............");

        String s2="Hyderabad is a nice city";  
		words = s2.split("a"); 

		for(String word : words)
		{
			System.out.println(word);
		} 
	}
}  






























