package this_super;

public class Super2 extends Super {
    int a=1000;
    
	public static void main(String[] args)
	{
		Super2 s=new Super2();
		s.test1();
	}
    
	public void test1()
	{
		int a=2000;
		System.out.println("calling global variable from same class "+this.a);
		System.out.println("calling local variable from same class "+a);
		System.out.println("calling global variable from super class "+super.a);
	}
}
