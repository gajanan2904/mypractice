package demo;

public class Variable2 {

	public static void main(String[] args)
	{
		
		Variable1 gaju=new Variable1();
		gaju.Emp_name="Gaju";
		gaju.Emp_code=123;
		gaju.Emp_grade='A';
		gaju.Emp_exp=2.5f;
		
		Variable1 daku=new Variable1();
		daku.Emp_name="daku";
		daku.Emp_code=456;
		daku.Emp_grade='c';
		daku.Emp_exp=2.7f;
		
		gaju.EmpInfo();
		daku.EmpInfo();
		
	}

}
