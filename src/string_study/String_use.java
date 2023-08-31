package string_study;

public class String_use {

	public static void main(String[] args) 
	{
		String a="velocity";//where A is a object
		
		//their are two methods of object creation
		
		String m="velocity";//without using new keyword
		String m1="velocity";//object stored in constant pool area
		String m2="Velocity pune";
		 
		String n=new String("Velocity");//with using new keyword    capital v
		String n1=new String("velocity");//object stored in non static pool area
		
//		System.out.println(m==m1);//check memory location
//		System.out.println(m==n1);
//		
//		System.out.println(m.equals(m1));//check content of a object
//		System.out.println(m.equals(n));
//		
//		System.out.println(m.length());//measure length of string
//		System.out.println(m2.length());
//		
//		System.out.println(m.toUpperCase());//convert to uppercase
//		String RefVariable=m.toUpperCase();//stored in refernce variable for future use in project
//		
//		System.out.println(RefVariable.toLowerCase());//convert to lower case
//		
//		System.out.println(m1.equalsIgnoreCase(n));//ignore case sensitivitness
//	

//		System.out.println(n1.contains("ve"));
//		System.out.println(n1.contains("vl"));
//		System.out.println(n.contains("ve"));//case sensitivness
//		
		 String ab="";
		String cd=" ";
		String pq="velocity";
//		System.out.println("isblank o/p of ab is "+ab.isBlank());
//		System.out.println("isempty o/p of ab is "+ab.isEmpty());
//		
//		System.out.println("isblank o/p of cd is "+cd.isBlank());
//		System.out.println("isempty o/p of cd is "+cd.isEmpty());
//		
//		System.out.println(pq.charAt(3));//char at index number
		
		System.out.println(pq.endsWith("t"));
		System.out.println(pq.endsWith("ty"));
		System.out.println(pq.endsWith("cit"));
		
		System.out.println(pq.startsWith("ve"));
		System.out.println(pq.startsWith("eloc"));
		
		System.out.println(pq.substring(2));
		System.out.println(pq.substring(2, 7));
		
		String x="velocity ";
		String y="Traning ";
		String z="Institute ";
		
		String finalstring= x.concat(y).concat(z);//concat opreation
		System.out.println("final string is "+finalstring);
		
		System.out.println(finalstring.indexOf('i'));
		System.out.println(finalstring.lastIndexOf('i'));
		
		String name="gaju";
		
		System.out.println(name.replace('g', 'b'));
		
		String p1="I LOVE MY INDIA";
		String seprator=" ";
		
		String[] splitedString=p1.split(seprator);
		
		for(int i=0;i<=splitedString.length-1;i++)
		{
			System.out.println(splitedString[i]); 
		}
				
		
		
		
		
		
		
		

	}

}
