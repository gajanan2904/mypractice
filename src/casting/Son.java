package casting;

public class Son extends Father {

	public static void main(String[] args)
	{
		//up casting-->acquiring sub class property into superclass
		//for upcasting we have to create sub class object with reference of super class
         
		Father r=new Son();
		r.bike();
	}
	
	public void bike()
	{
		System.out.println("Son bike is yamaha Rx100");
		
	}
	
	public void laptop()
	{
		System.out.println("son laptop is lenovo");
	}

}
