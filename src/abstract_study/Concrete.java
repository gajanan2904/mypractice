package abstract_study;

public class Concrete extends Sample1
{
public static void main(String[] args)
{
	Concrete c=new Concrete();
	c.test1();
	c.test2();
	c.test3();
	c.test4();
}

@Override
public void test3() {
	System.out.println("this method is complet in concrete class");
}

@Override
public void test4() {
	System.out.println("this method is complet in concrete class");
}
}
