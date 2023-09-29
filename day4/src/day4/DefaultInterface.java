package day4;

public interface DefaultInterface 
{
	public void addUser();
	public default void show()
	{
		System.out.println("Show");
	}

	public static void showUser()
	{
		System.out.println("static");
	}
}
