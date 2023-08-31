package acess_specifier;

public class As1 {

	public static void main(String[] args)
	{
		//4 types of AS   
	//	private--->within the class
		//default--->within the package
		//public--->throughout project
		//protected--->within package but acess in different package by inheritance
		
		As1 s=new As1();
		s.test1();
		s.test2();
		s.test3();
		s.test4();

	}
	public void test1()
	{
		System.out.println("public test1 of as1");
	}
	void test2()
	{
		System.out.println("default test2 of as1");
	}
	private void test3()
	{
		System.out.println("private test3 of as1");
	}
	protected void test4()
	{
		System.out.println("protected test4 of as1");
	}
	{
		
	}

}
