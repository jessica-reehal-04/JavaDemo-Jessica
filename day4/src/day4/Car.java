package day4;

public interface Car
{
	public void car();
	
	public default void driveCar()
	{
		System.out.println("Car Drive");
	}
}
