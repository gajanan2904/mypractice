package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_study {

	public static void main(String[] args) {
		
     LinkedHashSet lh=new LinkedHashSet<>();
    		 
    		 lh.add("velocity");
    		 lh.add(null); 
    		 lh.add(100);
    		 lh.add('A');
    		 lh.add(null);
    		 lh.add(100);
    		 
    		 System.out.println(lh);
    		 System.out.println(lh.size());
    		 
    		 lh.remove("velocity");
    		 System.out.println(lh);
    		 
    		 for(Object w:lh)
    		 {
    			 System.out.println(w);
    		 }
    		 
    		Iterator it = lh.iterator();
    		
    		while(it.hasNext())
    		{
    			System.out.println(it.next());
    		}
	}

}
