package this_super;

public class This {
	//this keyword use for acessing global variable from same class
	
	int a=100;
	static int b=200;

	public static void main(String[] args) 
	{   This t=new This();
		t.test1();
	}
	
public void test1()
{
	int a=300;
    int b=400;
    
    System.out.println("calling global vaiable A "+this.a);
    System.out.println("calling local variable A "+a);
    System.out.println("calling static global varaible "+this.b);
    System.out.println("calling non static local variable "+b);
}
}
