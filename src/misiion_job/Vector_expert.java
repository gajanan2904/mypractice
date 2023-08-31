package misiion_job;

import java.util.Iterator;
import java.util.Vector;

public class Vector_expert {

	public static void main(String[] args) {
		Vector vl=new Vector<>();
		
		vl.add("cpur");
		vl.add(123.45);
		vl.add(null);
		vl.add(123.45);
		vl.add('A');
		
		vl.add("pudi");
		System.out.println(vl);
		vl.remove(4);
		System.out.println(vl);
		vl.remove(123.45);
		System.out.println(vl );
		
		System.out.println(vl.capacity());
		System.out.println(vl.get(0));
		
		
		System.out.println("=====using for loop====");
		
		for(int i=0;i<=vl.size()-1;i++)
		{
			System.out.println(vl.get(i));
		}
		
		System.out.println("====using iterator=====");
		
		Iterator it = vl.iterator();
       
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Object o:vl)
		{
			System.out.println(o);
		}
	}

}
