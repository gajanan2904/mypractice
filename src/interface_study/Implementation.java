package interface_study;

public class Implementation implements Interface2 {

	public static void main(String[] args) {
		Implementation i=new Implementation();
		i.m1();
		i.m2();
		i.m3();
		i.m4();
	}

	@Override
	public void m1() {
		System.out.println("m1 completd in impl.class");
	}

	@Override
	public void m2() {
		System.out.println("m2 completd in impl.class");
	}

	@Override
	public void m3() {
		System.out.println("m3 completd in impl.class");
	}

	@Override
	public void m4() {
		System.out.println("m4 completd in impl.class");
		
	}

}
