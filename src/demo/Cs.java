package demo;

public class Cs


{ 
	int a;
	int b;
	int c;
	
	public Cs()
	{
		a=100;
		System.out.println(a);
	}
	public Cs(int num1)
	{
		a=num1;
		System.out.println(a);
	}
	public Cs(int num1,int num2)
	{
		a=num1;
		b=num2;
	}
	public Cs(int num1,int num2,int num3)
	{
		a=num1;
		b=num2;
		c=num3;
		
	}

	public static void main(String[] args)
	{
		Cs c1=new Cs();
		c1.addition();
		
		Cs c2=new Cs(10);
		c2.addition();
		
		Cs c3=new Cs(20, 30);
		c3.addition();
		
		Cs c4=new Cs(40, 50);
		c4.addition();
		
		Cs c5=new Cs(50, 60, 70);
		c5.addition(); 
				
		
		

	}
	
	public void addition()
	{
		int sum=a+b+c;
		System.out.println("sum is "+sum);
	}

}
