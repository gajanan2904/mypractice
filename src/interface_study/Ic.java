package interface_study;

public class Ic implements Myinterface
{

	public static void main(String[] args) {
		Ic i=new Ic();
		i.m1();
		i.m2();
	}

	@Override
	public void m1() {
		System.out.println("m1 completed in implementation class");
	}

	@Override
	public void m2() {
		System.out.println("m2 completed in implementation class");
		
	}

}
