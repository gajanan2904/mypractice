package demo;

public class Method_practice {

	public static void main(String[] args)
	{
		System.out.println("hii this is main method");
		
		test2();
		Check.test3();
		
		Method_practice m=new Method_practice();
		m.test1();
		Check c=new Check();
		c.test4();
		
		test5(10, 20);
		m.test6(100, 10);
		
		
		
	}
	
	//Regular method-->static,non static
	
	public void test1()
	{
		System.out.println("non static method from same class");
	}
	
	public static void test2()
	{
		System.out.println("static method from same class");
	}
	
	public static void test5(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void test6(int a,int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
	
	

}
