package casting;

public class Sample {

	public static void main(String[] args)
	{
		//implicit casting--->lower data type to higher data type
		//widening casing,memory size increses,no data loss
		
		int a=10;
		System.out.println("value of A "+a);
		
		
		float b=a;
		System.out.println("value of B is "+b);
		
		//explicit casting--->higher data type to lower data type
		//narrowing casting,memory size decreses,data loss occour
		
		float c=20;
		System.out.println("value of c is "+c);
		
		int d=(int) c;
		System.out.println("value of D is "+d);

	}

}
