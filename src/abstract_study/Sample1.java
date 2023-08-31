package abstract_study;

public abstract class Sample1 {

	public static void main(String[] args) 
	{
		test5();
		
	}
	public void test1()
	{
		System.out.println("complet method of abstract class");
	}
	public void test2()
	{
		//this is also complet method
	}
	public abstract void test3();
	
	public abstract void test4();//static method cant be incomplet method
	
	public static void test5()
	{
		System.out.println("complet static method");
	}

}
