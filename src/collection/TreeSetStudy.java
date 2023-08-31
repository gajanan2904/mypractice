package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<>();
		
		ts.add(5);
		ts.add(3);
		ts.add(1);
		ts.add(4);
		ts.add(2);
        //ts.add(null)   null pointer exception
		
		System.out.println(ts);//insertion ascending order
		
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		for(Object q:ts)
		{
			System.out.println(q);
		}
		
		Iterator<Integer> it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next() );
		}
	}

}
