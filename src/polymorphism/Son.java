 package polymorphism;

public class Son extends Father{

	public static void main(String[] args)
	{
		Father f=new Father();
		Son s=new Son();
		
		f.money();
		s.money();
	}
	public void money()
	{
		System.out.println("son money 1000");
	}

}
