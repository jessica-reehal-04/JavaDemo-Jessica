package day4;

public class BikeCar implements Car,Bike
{

	@Override
	public void bike() {
		System.out.println("Bike");
		
	}

	@Override
	public void car() {
		System.out.println("Car");
		
	}
	public static void main(String[] args)
	{
//		Bike b=new BikeCar();
//		Car c=new BikeCar();
//		
		BikeCar b=new BikeCar();
		b.driveCar();
		
	}


}
