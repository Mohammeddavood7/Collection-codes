package com.may7.classnot.ConcurrentCollection.failfastiteratot;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrectClass extends Thread
{
	CopyOnWriteArrayList<String> arl = null;
	
	public ConcurrectClass(CopyOnWriteArrayList<String> arl)
	{
		this.arl = arl;
	}
	
	@Override
	public void run()
	{
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		arl.add("kiwi");
		
	}
	public static void main(String[] args) 
	{
		
		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();
		al.add("Apple");
		al.add("Mango");
		al.add("Guava");
		al.add("Orange");
		ConcurrectClass con = new ConcurrectClass(al);
		con.start();
		
		Iterator<String> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			try {Thread.sleep(1500);} 
			catch (InterruptedException e) {e.printStackTrace();}
			
		}
		
		System.out.println("--------------------------------------------");
		
		Spliterator<String> sp = al.spliterator();
		sp.forEachRemaining(s -> System.out.println(s));
	
		
		
	}

}
















