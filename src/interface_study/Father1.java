package interface_study;

public interface Father1
{
	void money();
	void rules();
	default void love()
	{
		System.out.println("fathers love");
	}
	static void nature()
	{
		System.out.println("father static nature");
	}
}
