package day4;

public interface Bike 
{
	public void bike();
	
	public default void driveBike()
	{
		System.out.println("Bike Drive");
	}

}
