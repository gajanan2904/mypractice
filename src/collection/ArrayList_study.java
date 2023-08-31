package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_study {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		
		al.add("velocity");
		al.add(1232.45);
		al.add(null);
		al.add('A');
		al.add(1232.45);
		al.add(null);
		al.add('B');
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		al.add("hii");
		
		al.add(0,"GOOD MORNING");
		
        System.out.println(al);
		
		System.out.println(al.size());
		
		al.remove(0);
	    al.remove("velocity");
	   // al.remove('A'); when comment remove exception occured index out of bounds exceptionSystem.out.println("====for loop=====");
		
        System.out.println(al);
		
	    System.out.println(al.size());
	    
	    System.out.println(al.contains('A'));
	    
	    System.out.println(al.get(0));
	    
	    System.out.println("====for loop=====");
	    
	    for(int i=0;i<=al.size()-1;i++)
	    {
	    	System.out.println(al.get(i));
	    }
	    
	    System.out.println("====Iterator=====");
	    
	    Iterator it=al.iterator();
	    
	   // it.next();
	    
	    while(it.hasNext()) 
	    {
	    System.out.println(it.next());	
	    }
	    
	    System.out.println("====for each loop=====");
	    
	    for(Object o:al)
	     {
	    	System.out.println(o);
	    }
	   
	    ArrayList<Integer> al1=new ArrayList<>();
	    
	    al1.add(1);
	    al1.add(2);
	    al1.add(3);
	    al1.add(4);
	    
	    System.out.println("==== Iterator=====");
	    
	    Iterator<Integer> in=al1.iterator();
	    
	    while(in.hasNext())
	    {
	    	System.out.println(in.next());
	    }
	    
	    System.out.println("====for each loop=====");
	    
	   for(int p:al1)
	   {
		   System.out.println(p);
	   }
	 
	    
	    


	     
	    
	    
	}

}
