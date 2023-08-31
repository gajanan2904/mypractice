package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_study {

	public static void main(String[] args)
	{
		HashSet hs=new HashSet<>();
		
		hs.add("velocity");
		hs.add(null);
		hs.add(100);
		hs.add(null);
		hs.add('A');
		hs.add(100);
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		System.out.println(hs.contains(100));
		
//		for(int i=0;i<=hs.size()-1;i++)
//		{
//			System.out.println(hs.ge);
//		}
		
		Iterator it=hs.iterator();
		
		while (it.hasNext())
		{
			System.out.println( it.next());
			
		}
		
		for(Object r:hs)
		{
			System.out.println(r);
		}
//		
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
		
	}

}
