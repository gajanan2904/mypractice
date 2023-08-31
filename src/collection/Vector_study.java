package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_study {

	public static void main(String[] args) {
		
		Vector v=new Vector<>();
		
		v.add("velocity");
		v.add('A');
		v.add(123.32);
		v.add(null);
		v.add("hii");
		v.add(123.32);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		
		v.add(null);
		v.add(0, "good Morning");
		
		
		
		System.out.println(v);
		System.out.println(v.size());
		
		//v.remove('A');pls check when we remove char we get exception again
		v.remove(0);
		v.remove(123.32);//when we remove duplicate then upper one will be removed
        
		System.out.println(v);
		System.out.println(v.size());
		
		System.out.println(v.indexOf(null));
		
		System.out.println(v.get(3));
		
		System.out.println(v.contains(123.32));
		
		System.out.println("====for loop====");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("====Iterative====");
		
		Iterator it=v.iterator();
		//it.next();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("====List Iterative====");
		
		ListIterator li=v.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("====for each loop====");
		
		for(Object p:v)
		{
			System.out.println(p);
		}
		
		System.out.println("====Enumeration====");
		
		Enumeration en=v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}

}
