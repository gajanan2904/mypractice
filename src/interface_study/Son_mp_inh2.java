package interface_study;

public class Son_mp_inh2 implements Father1,Mother1 {

	public static void main(String[] args) {
		Son_mp_inh2 s=new Son_mp_inh2();
		s.love();
		s.money();
		Father1.nature();
		Mother1.nature();
		s.rules();

	}
	

	@Override
	public void money() {
		System.out.println("father money");
		
		
	}

	@Override
	public void rules() {
		System.out.println("father rule");
		
		
	}

	@Override
	public void love() {
		Father1.super.love();
		Mother1.super.love();
	}

}
