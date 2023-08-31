package interface_study;

public interface Mother1
{
	static void nature()
	{
		System.out.println("mother static nature");
	}
	default void love()
	{
		System.out.println("mothers love");
	}
}
