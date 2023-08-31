package interface_study;

public class Son_MP_inh implements Father,Mother {

	public static void main(String[] args) 
	{
		Son_MP_inh s=new Son_MP_inh();
		s.love();
		s.money();
		s.nature();
		s.rules();
	}

	@Override
	public void nature() {
		System.out.println("mothers nature completed in son");
	}

	@Override
	public void love() {
		System.out.println("mothers love completed in son");
		
	}

	@Override
	public void money() {
		System.out.println("father money completed in son");
	}

	@Override
	public void rules() {
		System.out.println("father rules completed in son");
		
	}

}
