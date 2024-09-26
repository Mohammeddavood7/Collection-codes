package com.may10.StreamApi;

import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.function.BiConsumer;

/*public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(114);
		List<Integer> list2 = list.stream().distinct().toList();
		System.out.println(list2);
	}
}*/



/*public class Test 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(16);
		list.add(14);
		Optional<Integer> max = list.stream().max((x, y) -> x.compareTo(y));
		System.out.println(max);
	}
}*/



/*public class Test {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("BC");
		al.add("CDE");
		al.add("DEFG");
		List<String> list = al.stream().filter(x -> x.length() >= 2).peek(x -> {}).toList();
		System.out.println(list);
	}
}*/




/*public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		List<Integer> list = al.stream().takeWhile(x->x<=10).toList();
		System.out.println(list);
	}
}*/




/*public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(-1);
		al.add(-2);
		al.add(-5);
		al.add(0);
		al.add(1);
		al.add(2);
		List<Integer> list = al.stream().skip(3).filter(y->y<=3).peek(x->{}).toList();
		System.out.println(list);
	}
}*/



/*public class Test {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet=new TreeSet<Integer>((x,y)->y.compareTo(x));
		treeSet.add(10); 
		treeSet.add(14);
		treeSet.add(13);
		System.out.println(treeSet);
		treeSet.stream().sorted(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 + o2;
			}
		}).forEach(System.out::println);
	}
}*/



/*public class Test {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        long count = words.stream()
                          .map(String::toUpperCase)
                          .filter(s -> s.startsWith("A"))
                          .count();
        System.out.println(count);
    }
}*/



/*public class Test {
	public static void main(String[] args) {
		try {
			List<Integer> words = Arrays.asList(new Integer[] {1,2,3,4,5,6});
			Integer result = words.stream().reduce((s1, s2) -> s1 + s2).orElse(0);    
			System.out.println(result);
			int arr[]=new int[] {1,2,3,4,5,6};
			Arrays.fill(arr, 2, 4, 8);
			System.out.println(Arrays.toString(arr));
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}*/


/*public class Test {
	static class Employee
	{
		private Integer id;
		private String name;
		public Integer getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public Employee(Integer id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}
	}
	public static void main(String[] args) {
		List<Employee> list = List.of(new Employee(1, "John") , 
									new Employee(5, "Ram") ,
									new Employee(7, "Tear") ,
									new Employee(4, "Jerry") ,
									new Employee(22, "You"));
		list.stream().limit(3).sorted((o1,o2)->o1.getId() - o2.getId()).forEach(System.out::println);
	}
}*/





/*public class Test {
	public static void main(String[] args) {
		ArrayDeque<String> de = new ArrayDeque<String>();
		de.push("well !!");
		de.push("prepare");
		System.out.println("Hi Everyone All The Best!!!");
		for (Object element : de) {
			System.out.println((String)element);
		}
	}
}*/


/*public class Capital {
    public static void main(String args[]) {
        List mylist = new ArrayList();
        int[] val = {15, 5565, 646, 233, 100};
        for (int element : val)
            mylist.add(new Integer(element));
        System.out.println(mylist);
        Iterator iterator = mylist.iterator();
        int i = mylist.size();  //i = 
        while (iterator.hasNext()) {
            Integer element = (Integer) iterator.next();
            int value = element.intValue();
            i--;
            if ((value < 100) || mylist.get(i).equals(100))
                iterator.remove();
        }
        System.out.println(mylist);
    }
}
*/

public class Testing 
{	public static void main(String[] args) 
	{		
		class demo
		{  String name;Integer id;
			public demo(String name, Integer id) 
			{	this.name = name;this.id = id;
			}
			public String getName() {return name;}
			public Integer getId() {return id;}
			static void meth()
			{
				TreeMap<demo, Integer> tm 
                                = new TreeMap<>((a,b)->a.getName().compareTo(b.getName()));
				tm.put(new demo("Hello", 01), 1);
				tm.put(new demo("zello", 05), 2);
				tm.put(new demo("Bello", 011), 3);
				tm.put(new demo("Oello", 010), 4);
				WeakHashMap<demo, Integer> wm = new WeakHashMap<>(tm);
				tm.forEach(new BiConsumer<demo, Integer>()
				{
					public void accept(demo t, Integer u) 
					{
						System.out.println(t.getName()+ " " + t.getId() + " " + u);
					}
				});}}
		demo.meth();
		
		System.out.println("------------------------------");
		String str1 = "Hello";
		String str2 = "zello";
		String str3 = "Bello";
		String str4 = "Oello";

		
		System.out.println(str1+"  : "+str1.hashCode());
		System.out.println(str2+"  : "+str2.hashCode());
		System.out.println(str3+"  : "+str3.hashCode());
		System.out.println(str4+"  : "+str4.hashCode());

	}
}


























