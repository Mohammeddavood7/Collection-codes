package com.may10.StreamApi;

import java.util.stream.Stream;

/*public class StreamDemo13 
{
	public static void main(String[] args) 
	{
		Stream<String> numbers = Stream.of("Apple","Mango","Grapes","Kiwi","pomogranate");

		List<Integer> doubledNumbers = numbers
		    .peek(str -> System.out.println("Peeking from Original: " + str.toUpperCase()))
		    .map(num -> num.length())
		    .collect(Collectors.toList());
		System.out.println("-----------------");
		System.out.println(doubledNumbers);
		
	}

}*/


/*public class StreamDemo14 
{
 public static void main(String[] args) 
 {
	 Stream<Integer> numbers = Stream.of(10,11,9,13,2,1,100);

     numbers.takeWhile(n -> n > 9).forEach(System.out::println);     

     System.out.println(".......................");
    
     numbers = Stream.of(12,2,3,4,5,6,7,8,9);
     
     numbers.takeWhile(n -> n%2==0).forEach(System.out::println);
     
    
     System.out.println(".......................");
     
     numbers = Stream.of(1,2,3,4,5,6,7,8,9);
     
     numbers.takeWhile(n -> n < 9).forEach(System.out::println);
     
     System.out.println(".......................");
    
     numbers = Stream.of(11,2,3,4,5,6,7,8,9); 
     
     numbers.takeWhile(n -> n > 9).forEach(System.out::println);
    
     System.out.println(".............................");
     
     Stream<String> stream = Stream.of("Ravi", "Ankit", "Rohan", "Aman", "Ravish"); 

     stream.takeWhile(str -> str.charAt(0)=='R').forEach(System.out::println); 
     
    //10,11
     //12,2
     //1,2,3,4,5,6,7,8
     //11
     //Ravi
     
	 
 }
}*/




public class StreamDemo15 {

	public static void main(String[] args) 
	{
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numbers.dropWhile(num -> num < 5).forEach(System.out::println);
		
		System.out.println("..................................");
		
		numbers = Stream.of(15, 8, 7, 9, 5, 6, 7, 8, 9, 10);

		numbers.dropWhile(num -> num > 5).forEach(System.out::println);
		
        String str1 ="heello";
        System.out.println("--------------------------");
        str1.chars().distinct().forEach(v->System.out.print((char)v));
		
	}

}
