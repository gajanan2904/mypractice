package misiion_job;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_expert {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList<>();
		
		al.add("gaju");
		al.add(123);
		al.add("adwe");
		al.add(null);
		al.add(123);
		al.add("it");
		al.add(null);
		
		System.out.println(al);
		al.add("cheater");
		System.out.println(al);//add to last of list
		al.add(0, "gajanan");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.contains(123));
		System.out.println(al.size());
		System.out.println(al.clone());
		
		System.out.println("=====for loop=====");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("=====for each loop=====");
		
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		System.out.println("===iterator====");
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		

			

		}
		

	}


