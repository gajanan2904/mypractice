package polymorphism;

public class Overloading {

	public static void main(String[] args)
	{
		Overloading o=new Overloading();
		o.add();
		o.add(10, 20);
		o.add(30, 40);
		o.add(50, 60, 70);
		Overloading.add(10, 20, 30, 40);
		Overloading.add(10.10f, 10, 10, 10);
	}
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void add(float a,float b)
	{
		float sum=a+b;
		System.out.println(sum);
	}
	public void add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println(sum);
	}
	public static void add(int a,int b,int c,int d)
	{
		int sum=a+b+c+d;
		System.out.println(sum);
	}
	public static void add(float a,int b,int c,int d)
	{
		float sum=a+b+c+d;
		System.out.println(sum);
	}
	
}
