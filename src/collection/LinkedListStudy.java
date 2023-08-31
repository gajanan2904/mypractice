package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args)
	{
		
    LinkedList ll=new LinkedList<>();
    
    ll.add("abc");
	ll.add(100);
	ll.add('A');
	ll.add(65.5f);
	ll.add(100);
	ll.add(null);
	ll.add(null);
	
	System.out.println(ll);
	System.out.println(ll.size());
	
	ll.add("velocity");
	ll.add(0, "good morning");
	
	System.out.println(ll);
	System.out.println(ll.size());
	
	ll.remove("velocity");
	ll.remove(0);
	
	System.out.println(ll);
	System.out.println(ll.size());
	
	ll.set(0, "hii");//replace the element at specified position with sepcified element
	
	System.out.println(ll);
	System.out.println(ll.size());
	
	System.out.println("=====for loop====");
	
	for(int i=0;i<=ll.size()-1;i++)
	{
		System.out.println(ll.get(i));
	}
	
	System.out.println("=====for each loop====");
	
	for(Object c:ll)
	{
		System.out.println(c);
	}
	
	System.out.println("=====Iterative====");
	
	Iterator it=ll.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	}

}
